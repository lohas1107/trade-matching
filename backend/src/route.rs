use warp::{Filter, path, Rejection, Reply};

fn order_path() -> impl Filter<Extract = (), Error = Rejection> + Copy {
    path!("v1" / "stack" / "orders")
}

pub fn route() -> impl Filter<Extract=(impl Reply, ), Error=Rejection> + Clone {
    let place_order = warp::post()
        .and(order_path())
        .map(warp::reply);

    place_order
}
