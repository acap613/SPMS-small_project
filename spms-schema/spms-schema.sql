CREATE TABLE story_pitch (
    book_id NUMBER(24) PRIMARY KEY,
    author_id NUMBER(24),
    title VARCHAR2(50) not null,
    completion_date DATE,
    word_count NUMBER(10) not null,
    genre VARCHAR2(20) not null,
    story_tag VARCHAR2(50),
    description VARCHAR2(1000),   
    approved CHAR(1),
    on_hold CHAR(1)
)

CREATE TABLE completed_story(
    book_id NUMBER(24),
    story_text TEXT
)

CREATE TABLE author(
    author_id NUMBER(24) PRIMARY KEY,
    author_name VARCHAR(50),
    points_used NUMBER(3)
)

CREATE TABLE story_type (
    story_type_id NUMBER(24) PRIMARY KEY,
    story_type VARCHAR(50) not null,
    points_value NUMBER(2) not null
)

CREATE TABLE genre (
    genre_id NUMBER(24) PRIMARY KEY,
    genre_name VARCHAR(50)
)

CREATE TABLE assistant_editors (
    editor_id NUMBER(24) PRIMARY KEY,
    editor_name VARCHAR(50),
    editor_genre NUMBER(24),
    points_available NUMBER(3)
)

CREATE TABLE senior_editors (
    editor_id NUMBER(24) PRIMARY KEY,
    editor_name VARCHAR(50),
    editor_genre NUMBER(24),
    points_available NUMBER(10)
)

CREATE TABLE general_editors (
    editor_id NUMBER(24) PRIMARY KEY,
    editor_name VARCHAR(50),
)
