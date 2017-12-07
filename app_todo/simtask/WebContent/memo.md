CREATE TABLE simtask.task(id int primary key auto_increment, title varchar(256), task varchar(512), limitdate date);

CREATE TABLE simtask.user(id int primary key auto_increment, userid varchar(50), password varchar(50));

INSERT INTO simtask.task(id, title, task, limitdate) VALUES(1, "aaa", "bbb", "1982-01-22");

INSERT INTO simtask.user(id, userid, password) VALUES(1, "user", "user1");
