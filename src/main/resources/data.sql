-- USERS
INSERT INTO my_user (name)
VALUES ('mahri');

INSERT INTO my_user (name)
VALUES ('hnin');

INSERT INTO my_user (name)
VALUES ('bo');

SELECT * FROM my_user;

-- POSTS
INSERT INTO post (user_id, title, content, author)
VALUES (1, 'Wakeup!', 'so sleepy', 'John');

INSERT INTO post (user_id, title, content, author)
VALUES (2, 'Laptop Dell', 'Hohoho', 'IOS');

INSERT INTO post (user_id, title, content, author)
VALUES (3, 'Apple!', 'Expensive', 'SAMSUNG');

--COMMENT
INSERT INTO comment (post_id, name)
VALUES (1, 'Good job!!');

INSERT INTO comment (post_id, name)
VALUES (1, 'So good!!');

INSERT INTO comment (post_id, name)
VALUES (2, 'Amazinggg!!');

INSERT INTO comment (post_id, name)
VALUES (3, 'Badddd!!');

SELECT * FROM comment




