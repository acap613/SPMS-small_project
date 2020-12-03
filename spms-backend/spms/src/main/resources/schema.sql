DROP TABLE author;
DROP TABLE story_pitch;

CREATE TABLE author (
	id NUMBER GENERATED ALWAYS AS IDENTITY,
	first_name VARCHAR2(255),
	last_name VARCHAR2(255),
	points_allowed NUMBER(5)
);



CREATE TABLE story_pitch (
    book_id NUMBER GENERATED ALWAYS AS IDENTITY,
    author_id NUMBER(24),
    title VARCHAR2(50) not null,
    completion_date DATE,
    word_count NUMBER(10) not null,
    genre VARCHAR2(20) not null,
    story_tag VARCHAR2(50),
    description VARCHAR2(1000),   
    approved CHAR(1),
    on_hold CHAR(1)
);