DROP TABLE author;
DROP TABLE story_pitch;
DROP TABLE genre;
DROP TABLE story_type;
DROP TABLE story_draft;
drop table editor;

CREATE TABLE author (
	id NUMBER GENERATED ALWAYS AS IDENTITY,
	first_name VARCHAR2(255),
	last_name VARCHAR2(255),
	current_points NUMBER(5),
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

CREATE TABLE genre (
	genre_id NUMBER GENERATED ALWAYS AS IDENTITY,
	genre VARCHAR(24)
);

CREATE TABLE story_type (
	story_type_id NUMBER GENERATED ALWAYS AS IDENTITY,
	story_type VARCHAR(24),
	points NUMBER(3)
);

CREATE TABLE story_draft (
	draft_id NUMBER GENERATED ALWAYS AS IDENTITY,
	draft_text BLOB,
	is_completed CHAR(1),
	is_approved CHAR(1)
);

CREATE TABLE editor (
	editor_id NUMBER GENERATED ALWAYS AS IDENTITY,
	first_name VARCHAR(24),
	last_name VARCHAR(24),
	points_allowed NUMBER(5),
	is_assistant CHAR(1),
	is_senior CHAR(1),
	is_general CHAR(1),
	genres VARCHAR(1000)
	
);