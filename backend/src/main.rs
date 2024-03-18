use warp::Filter;

#[tokio::main]
async fn main() {
    let place_order = warp::post()
        .and(warp::path("v1"))
        .and(warp::path("stack"))
        .and(warp::path("orders"))
        .map(warp::reply);

    let route = place_order;

    warp::serve(route)
        .run(([127, 0, 0, 1], 3030))
        .await;
}
