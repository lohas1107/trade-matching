use std::error::Error;
use diesel_migrations::{embed_migrations, EmbeddedMigrations, MigrationHarness};
pub const MIGRATIONS: EmbeddedMigrations = embed_migrations!();
type DB=diesel::mysql::Mysql;

fn run_migrations(connection: &mut impl MigrationHarness<DB>) -> Result<(), Box<dyn Error + Send + Sync + 'static>> {
    // https://docs.rs/diesel_migrations/latest/diesel_migrations/macro.embed_migrations.html
    // This will run the necessary migrations.
    //
    // See the documentation for `MigrationHarness` for
    // all available methods.
    connection.run_pending_migrations(MIGRATIONS)?;

    Ok(())
}


// embed_migrations!("./mysql");
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