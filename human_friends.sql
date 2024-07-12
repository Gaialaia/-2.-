
--  7. 2 - В ранее подключенном MySQL создать базу данных с названием "Human Friends":

-- create database HumanFriends;

use HumanFriends;
-- -  Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
   

-- create table Pets (
-- id SMALLINT auto_increment NOT NULL primary key,
-- name char(20),
-- type varchar(20),
-- gender varchar(7),
-- birthdate date, 
-- commands varchar(50)
-- );

-- - Заполнить таблицы данными о животных, их командах и датами рождения.

insert into Pets (name, type, gender, birthdate, commands) values 
('Felix','dog','male', '2020-06-12','roll over, sit, give paws'),
('Ryzhy', 'cat', 'male', '2018-02-11', 'somersoults, swim'),
('Hipster', 'lizard','male', '2023-07-10', 'show tongue'),
('Kvasir', 'parrot', 'male', '2022-08-15', 'cursing'),
('Amelia', 'cat', 'female', '2021-01-24', 'jump on back paws'),
('Jango', 'pygmy hog', 'male', '2022-03-16', 'dance'),
('Cowboy', 'turtle', 'male', '2002-03-22', 'wagging tale'),
('Vaska', 'cat', 'female', '2021-04-02', 'fetches a ball'),
('Pie', 'dog', 'female', '2021-05-14', 'walks backwards');

SELECT * FROM Pets;

create table PackAnimals (
id smallint auto_increment PRIMARY KEY,
name char(20),
type varchar(20),
gender char(7),
birthdate date, 
commands varchar(50)
)AUTO_INCREMENT=100;

insert into PackAnimals (name, type, gender, birthdate, commands) values 
('Clover', 'horse', 'male', '2019-05-03', 'count'),
('Romashka', 'horse', 'female', '2018-08-22', 'drawing, fetching things'),
('Abu', 'camel', 'male', '2015-02-13', 'show tongue, hit with wagging tale'),
('Mario', 'donkey', 'male', '2020-04-15', 'catch a ball'),
('Wind', 'horse', 'male', '2017-09-18', 'trot, gallop'),
('Victory', 'horse', 'female', '2014-05-05', 'drawing, trotting'),
('Gamlet', 'donkey', 'male', '2019-04-01', 'catch a ball, carry load'),
('Marusya', 'cow', 'female', '2022-08-22', 'walk, canter'),
('Mario', 'donkey', 'male', '2020-04-15', 'catch a ball'),
('Gamlet', 'donkey', 'male', '2021-04-01', 'trot, carry load'),
('Dino', 'donkey', 'male', '2020-04-15', 'prance'),
('Cookie', 'donkey', 'female', '2020-05-01', 'catch a ball, carry load'),
('Pegasus', 'horse', 'male', '2019-05-03', 'count, trot'),
('Wind', 'horse', 'male', '2017-09-18', 'trot, gallop'),
('Golden Fleece', 'horse', 'female', '2019-04-25', 'drawing, gallop'),
('Hephaestus', 'horse', 'male', '2020-08-22', 'trot, fetching things'),
('Pobeda', 'horse', 'female', '2022-08-22', 'gallop, fetching things'),
('Korol', 'donkey', 'male', '2021-09-15', 'catch a ball'),
('Rasputin', 'donkey', 'male', '2021-11-01', 'trot, carry load'),
('Vasilisa', 'donkey', 'female','2022-07-15', 'prance'),
('Belosnezhka', 'horse', 'female','2023-07-01', 'catch a ball, carry load');

SELECT * FROM PackAnimals;

create table horses AS 
SELECT id, name, type, gender, birthdate, commands
FROM PackAnimals
WHERE type = 'horse';
SELECT *FROM horses;

create table donkeys AS
SELECT id, name, type, gender, birthdate, commands
FROM PackAnimals
WHERE type = 'donkey';

-- Удалить записи о верблюдах    

-- DELETE FROM PackAnimals WHERE type ='camel';

SELECT * FROM PackAnimals;

-- и объединить таблицы лошадей и ослов.

SELECT *FROM horses
UNION
SELECT * FROM donkeys;

 -- Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
 
CREATE TABLE animal_kids AS 
SELECT id, name, type, gender, birthdate, commands, 
TIMESTAMPDIFF (YEAR, birthdate, now() ) as how_many_years,
TIMESTAMPDIFF( MONTH, birthdate, now() ) % 12 as how_many_months,
TIMESTAMPDIFF (YEAR,birthdate,CURDATE()) AS age 
FROM domestic_animals
WHERE TIMESTAMPDIFF(YEAR, birthdate,NOW()) BETWEEN  0 AND 3;

SELECT * FROM animal_kids;


-- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

CREATE TABLE domestic_animals AS 
SELECT id, name, type, gender, birthdate, commands
FROM Pets
UNION
SELECT id, name, type, gender, birthdate, commands
FROM PackAnimals;
 
 SELECT * FROM domestic_animals;







SELECT da.id, da.name, da.type, da.gender, da.birthdate, da.commands, ak.how_many_years, ak.how_many_months
FROM domestic_animals da
LEFT JOIN animal_kids ak
ON da.id = ak.id;

SELECT * FROM PackAnimals
LEFT JOIN animal_kids
ON PackAnimals.id = animal_kids.id
UNION 
SELECT * FROM pets
LEFT JOIN animal_kids
ON pets.id = animal_kids.id;







