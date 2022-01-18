CREATE TABLE parent_c (
                          "id" BIGSERIAL,
                          "id_address" BIGINT NULL,
                          "first_name" VARCHAR(45) NOT NULL,
                          "middle_name" VARCHAR(45) NULL,
                          "last_name" VARCHAR(45) NOT NULL,
                          PRIMARY KEY ("id"));

CREATE TABLE child_c (
                         "id" BIGSERIAL,
                         "first_name" VARCHAR(45) NOT NULL,
                         "middle_name" VARCHAR(45) NULL,
                         "last_name" VARCHAR(45) NOT NULL,
                         "institution_id" BIGINT NOT NULL,
                         "age" SMALLINT NULL,
                         PRIMARY KEY ("id"));

CREATE TABLE institution (
                             "id" BIGSERIAL,
                             "id_address" BIGINT NULL,
                             "no" VARCHAR(45) NULL,
                             PRIMARY KEY ("id"));

CREATE TABLE district (
                          "id" BIGSERIAL,
                          "name" VARCHAR(45) NULL,
                          PRIMARY KEY ("id"));

CREATE TABLE address
(
    "id"           BIGSERIAL,
    "city"         VARCHAR(45) NULL,
    "address"      VARCHAR(45) NULL,
    "postal_code"  VARCHAR(45) NULL,
    "more_address" VARCHAR(45) NULL,
    "district_id"  BIGINT NULL,
    PRIMARY KEY ("id")
);
CREATE TABLE parent_child_c (
                                "id" BIGSERIAL,
                                "id_child_c" BIGINT NOT NULL,
                                "id_parent_a" BIGINT NOT NULL,
                                PRIMARY KEY ("id"));
