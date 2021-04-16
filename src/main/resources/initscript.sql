CREATE TABLE Films (
   id text  NOT NULL,
   name text  NOT NULL,
   year int  NOT NULL,
   genre text  NOT NULL,
   Director_id int  NOT NULL,
   img text  NOT NULL,
   CONSTRAINT Films_pk PRIMARY KEY (id)
);
CREATE TABLE "User" (
   id text  NOT NULL,
   isAdmin boolean  NOT NULL,
   login text  NOT NULL,
   password text  NOT NULL,
   CONSTRAINT User_pk PRIMARY KEY (id)
);
CREATE TABLE Director (
   id text  NOT NULL,
   name text  NOT NULL,
   img text  NOT NULL,
   CONSTRAINT Director_pk PRIMARY KEY (id)
);
CREATE TABLE Views  (
   Films_id text  NOT NULL,
   User_id text  NOT NULL
);