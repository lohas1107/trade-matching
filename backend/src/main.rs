mod route;
mod order;
mod migration;

#[tokio::main]
async fn main() {
    warp::serve(route::route())
        .run(([127, 0, 0, 1], 3030))
        .await;
}
