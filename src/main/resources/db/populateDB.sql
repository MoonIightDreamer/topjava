DELETE FROM MEALS;
DELETE FROM user_roles;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id)
VALUES ('USER', 100000),
       ('ADMIN', 100001);

INSERT INTO meals (user_id, date_time, description, calories)
VALUES  (100001, '2020-12-19 10:00', 'Breakfast', 420),
        (100001, '2020-11-12 17:30', 'Lunch', 1100),
        (100000, '2021-03-12 10:30', 'Breakfast', 640),
        (100000, '2021-04-27 17:25', 'Lunch', 1000);


