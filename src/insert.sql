
USE adlister_db;

DROP TABLE users;

CREATE TABLE IF NOT EXISTS users (
                       id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                       username VARCHAR(240) UNIQUE NOT NULL,
                       email VARCHAR(240) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       CONSTRAINT constraint_username UNIQUE(username),
                       PRIMARY KEY (id)
);

CREATE TABLE posts (
                       body TEXT NOT NULL,
                       title VARCHAR(240) NOT NULL,
                       user_id VARCHAR(240) UNIQUE NOT NULL,
                       PRIMARY KEY (user_id)
);

INSERT INTO users(email, password, username) VALUES("test@email.com", "$2a$10$ZQ4vTOdzSNRMTfbJsFjjP.D/8fc3RCldobcoepaQ7caghQXM2qGN.", "codetheyduck");

INSERT INTO posts(body, title, user_id) VALUES("This is my first blog post!", "My First Blog", 1);