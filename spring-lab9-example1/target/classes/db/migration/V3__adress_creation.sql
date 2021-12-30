CREATE TABLE addresses (
    id BIGINT NOT NULL AUTO_INCREMENT,
    address VARCHAR(50) NOT NULL,
    user_id BIGINT NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);