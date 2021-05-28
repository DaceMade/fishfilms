CREATE TABLE Films
(
    id          uuid NOT NULL,
    name        text NOT NULL,
    year        int  NOT NULL,
    genre       text NOT NULL,
    Director_id uuid  NOT NULL,
    img         text NOT NULL,
    CONSTRAINT Films_pk PRIMARY KEY (id)
);
CREATE TABLE Users
(
    id       uuid    NOT NULL,
    is_admin  boolean NOT NULL,
    login    text    NOT NULL,
    password text    NOT NULL,
    CONSTRAINT User_pk PRIMARY KEY (id)
);
CREATE TABLE Director
(
    id   uuid NOT NULL,
    name text NOT NULL,
    img  text NOT NULL,
    CONSTRAINT Director_pk PRIMARY KEY (id)
);
CREATE TABLE Views
(
    id       uuid NOT NULL,
    Films_id uuid NOT NULL,
    User_id  uuid NOT NULL
);