use warp::{Filter, path, Rejection};
use warp::filters::BoxedFilter;

fn order_path() -> impl Filter<Extract=(), Error=Rejection> + Copy {
    path!("v1" / "stack" / "orders")
}

pub fn post_order() -> BoxedFilter<()> {
    warp::post()
        .and(order_path())
        .boxed()
}
