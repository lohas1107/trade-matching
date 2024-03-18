use warp::{Filter, Rejection};

#[tokio::main]
async fn main() {
    warp::serve(routes())
        .run(([127, 0, 0, 1], 3030))
        .await;
}

fn routes() -> impl Filter<Extract=(impl warp::Reply, ), Error=Rejection> + Clone {
    let place_order = warp::post()
        .and(warp::path("v1"))
        .and(warp::path("stack"))
        .and(warp::path("orders"))
        .map(warp::reply);

    place_order
}
