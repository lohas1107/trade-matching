mod route;
mod order;
mod migration;


// embed_migrations!("../migrations");
// 
// fn main() {
//     let connection = establish_connection();
// 
//     // This will run the necessary migrations.
//     embedded_migrations::run(&connection);
// 
//     // By default the output is thrown out. If you want to redirect it to stdout, you
//     // should call embedded_migrations::run_with_output.
//     embedded_migrations::run_with_output(&connection, &mut std::io::stdout());
// }



#[tokio::main]
async fn main() {
    warp::serve(route::route())
        .run(([127, 0, 0, 1], 3030))
        .await;
}
