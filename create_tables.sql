-- Table: public."circleData"

-- DROP TABLE public."circleData";

CREATE TABLE public."circleData"
(
    "memberName" text COLLATE pg_catalog."default" NOT NULL,
    "memberRole" text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "circleData_pkey" PRIMARY KEY ("memberName", "memberRole")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."circleData"
    OWNER to postgres;

-- Table: public."circlesData"

-- DROP TABLE public."circlesData";

CREATE TABLE public."circlesData"
(
    "circleId" bigint NOT NULL,
    "circleName" text COLLATE pg_catalog."default" NOT NULL,
    "numberOfMembers" smallint NOT NULL,
    CONSTRAINT "circlesData_pkey" PRIMARY KEY ("circleId", "circleName", "numberOfMembers")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."circlesData"
    OWNER to postgres;


-- Table: public."userData"

-- DROP TABLE public."userData";

CREATE TABLE public."userData"
(
    "userID" integer NOT NULL,
    "firstName" text COLLATE pg_catalog."default" NOT NULL,
    "lastName" text COLLATE pg_catalog."default" NOT NULL,
    "emailAddress" text COLLATE pg_catalog."default" NOT NULL,
    password "char"[] NOT NULL,
    "numberOfCircles" smallint NOT NULL,
    CONSTRAINT "userData_pkey" PRIMARY KEY ("userID", "firstName", "lastName", "emailAddress", password, "numberOfCircles")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."userData"
    OWNER to postgres;