use std::convert::Infallible;
use diesel::MysqlConnection;

use warp::http::StatusCode;

use crate::route::Pool;

pub async fn create_order(pool: Pool) -> Result<impl warp::Reply, Infallible> {
    let _: &MysqlConnection = &pool.get().unwrap();
    Ok(StatusCode::CREATED)
}
