use std::env;

mod route;
mod order;

#[tokio::main]
async fn main() {
    if env::var_os("RUST_LOG").is_none() {
        env::set_var("RUST_LOG", "debug");
    }
    pretty_env_logger::init();
    
    warp::serve(route::route())
        .run(([127, 0, 0, 1], 3030))
        .await;
}
