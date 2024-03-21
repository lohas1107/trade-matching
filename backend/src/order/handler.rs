use warp::http::StatusCode;

pub fn create_order() -> fn() -> StatusCode {
    || { StatusCode::CREATED }
}
