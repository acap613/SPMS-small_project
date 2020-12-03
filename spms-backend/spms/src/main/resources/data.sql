INSERT INTO author (first_name, last_name, points_allowed) values('Tony', 'Stark', 100);
INSERT INTO author (first_name, last_name, points_allowed) values('Sasha', 'Malotov', 80);
INSERT INTO author (first_name, last_name, points_allowed) values('Brent', 'Haddock', 100);

INSERT INTO story_pitch(author_id, title, completion_date, word_count, genre, story_tag, description, approved, on_hold)
VALUES(1, 'To Hell and Back: Iron Man Origins', TO_DATE('11/13/2021', 'mm/dd/yyyy'), 7329, 'autobiography', 'war', 'A short story of my capure and release during the war in the Middle East', 'N', 'N')