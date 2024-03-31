use std::error::Error;

use diesel::{MysqlConnection, r2d2};
use diesel::r2d2::ConnectionManager;
use warp::Filter;
use warp::filters::BoxedFilter;

use crate::order::{handler, path};

pub fn route() -> impl Filter<Extract=(impl warp::Reply, ), Error=warp::Rejection> + Clone {
    let database = database().expect("Database");

    path::post_order()
        .and(database.clone())
        .and_then(handler::create_order)
}

pub type Pool = r2d2::Pool<ConnectionManager<MysqlConnection>>;

pub fn database() -> Result<BoxedFilter<(Pool, )>, Box<dyn Error>> {
    let url = "mysql://root:root@host.docker.internal:3306/trade";
    let manager = ConnectionManager::<MysqlConnection>::new(url);
    let pool = Pool::builder().build(manager)?;
    Ok(warp::any().map(move || pool.clone()).boxed())
}
