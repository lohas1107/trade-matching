use warp::{Filter, Rejection, Reply};
use crate::order::{handler, path};

pub fn route() -> impl Filter<Extract=(impl Reply, ), Error=Rejection> + Clone {
    path::post_order().map(handler::create_order())
}