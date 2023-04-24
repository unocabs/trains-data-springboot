DROP SCHEMA IF EXISTS rgian CASCADE;
CREATE SCHEMA rgian;

CREATE TABLE rgian.TITANIC (
    passenger_id uuid,
    survived integer,
    pclass integer,
    pass_name character varying(100),
    sex character varying(10),
    age integer,
    sibsp integer,
    parch integer,
    ticket character varying,
    fare double precision,
    cabin character varying,
    embarked character varying(5),
    PRIMARY KEY (passenger_id)
    );