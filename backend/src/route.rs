use warp::{Filter, path, Rejection, Reply};
use warp::filters::BoxedFilter;
use warp::http::StatusCode;

fn order_path() -> impl Filter<Extract=(), Error=Rejection> + Copy {
    path!("v1" / "stack" / "orders")
}

pub fn route() -> impl Filter<Extract=(impl Reply, ), Error=Rejection> + Clone {
    post_order().map(create_order())
}

pub fn post_order() -> BoxedFilter<()> {
    warp::post()
        .and(order_path())
        .boxed()
}

pub fn create_order() -> fn() -> StatusCode {
    || { StatusCode::CREATED }
}