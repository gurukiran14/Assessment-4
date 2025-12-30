CREATE DATABASE school_db;
use school_db;
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    dob DATE,
    marks INT
);
INSERT INTO student VALUES
(1, 'Gurukiran', 'gurukiran.ks@tcs.com', '2002-06-26', 99),
(2, 'Ani', 'ani@gmail.com', '2003-05-30', 85),
(3, 'Div', 'div@gmail.com', '2003-02-07', 95),
(4, 'Shishir', 'shishira@gmail.com', '2015-07-09', 90),
(5, 'Anand', 'anand@gmail.com', '2002-07-28', 78);


SELECT * FROM student WHERE marks > 70;
SELECT AVG(marks) AS average_marks FROM student;
SELECT MAX(marks) AS maximum_marks FROM student;
SELECT * FROM student ORDER BY marks DESC;


CREATE TABLE course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50),
    student_id INT,
    FOREIGN KEY (student_id) REFERENCES student(id)
);
INSERT INTO course VALUES (101, 'Mathematics', 1), (102, 'Science', 4), (103, 'English', 3);
SELECT s.name, s.marks, c.course_name
FROM student s
JOIN course c
ON s.id = c.student_id;





