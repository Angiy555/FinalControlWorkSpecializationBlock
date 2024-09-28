# Итоговая контрольная работа

### Информация о проекте
 Необходимо организовать систему учета для питомника в котором живут домашние и Pack animals.

### Как сдавать проект

Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом репозитории, использовать пул реквесты на изменения. Программа должна запускаться и работать, ошибок при выполнении программы быть не должно. Программа, может использоваться в различных системах, поэтому необходимо разработать класс в виде конструктора

## Задание

### 1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными (заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).

Создаем файл "Домашние животные" (Pets):
![Task_1_1](./Screenshots/Task_1_1.jpg)

Создаем файл "Вьючные животные" (Pack_animals):
![Task_1_2](./Screenshots/Task_1_2.jpg)

Объединяем содержимое двух файлов в один (United.txt)
![Task_1_3](./Screenshots/Task_1_3.jpg)

Переименовываем полученный файл в "Друзья человека" (Human_Friends.txt)
![Task_1_4](./Screenshots/Task_1_4.jpg)

### 2. Создать директорию, переместить файл туда.

Создаем новую директорию NewDir
![Task_2_1](./Screenshots/Task_2_1.jpg)

Перемещаем туда файл Human_Friends.txt
![Task_2_2](./Screenshots/Task_2_2.jpg)

### 3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.

Устанавливаем MySql
![Task_3_1](./Screenshots/Task_3_1.jpg)
![Task_3_2](./Screenshots/Task_3_2.jpg)
![Task_3_3](./Screenshots/Task_3_3.jpg)
![Task_3_4](./Screenshots/Task_3_4.jpg)
![Task_3_5](./Screenshots/Task_3_5.jpg)

### 4. Установить и удалить deb-пакет с помощью dpkg.

Установка deb-пакета mc
![Task_4_1](./Screenshots/Task_4_1.jpg)
![Task_4_2](./Screenshots/Task_4_2.jpg)
![Task_4_3](./Screenshots/Task_4_3.jpg)
![Task_4_4](./Screenshots/Task_4_4.jpg)
![Task_4_5](./Screenshots/Task_4_5.jpg)

Удаление deb-пакета
![Task_4_6](./Screenshots/Task_4_6.jpg)

### 5. Выложить историю команд в терминале ubuntu.
Просмотр истории команд
![Task_5_1](./Screenshots/Task_5_1.jpg)
~~~
   1  ls
   2  cat > Pets.txt
   3  ls
   4  cat > Pack_animals.txt
   5  ls
   6  cat Pets.txt Pack_animals.txt > United.txt
   7  ls
   8  cat United.txt
   9  mv United.txt Human_Friends.txt
   10  ls
   11  mkdir NewDir
   12  ls
   13  mv Human_Friends.txt NewDir/
   14  ls
   15  cd NewDir
   16  ls
   17  cd ~
   18  wget https://dev.mysql.com/get/mysql-apt-config_0.8.28-1_all.deb
   19  sudo dpkg -i mysql-apt-config_0.8.28-1_all.deb
   20  sudo apt-get update
   21  sudo apt-get install mysql-server
   22  systemctl status mysql
   23  wget http://archive.ubuntu.com/ubuntu/pool/universe/m/mc/mc_4.8.24-2ubuntu1_amd64.deb
   24  sudo dpkg -i mc_4.8.24-2ubuntu1_amd64.deb
   25  sudo apt install -f
   26  mc
   27  sudo dpkg -r mc
~~~

### 6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы.

![Task_6_1](./Screenshots/Task_6_1.jpg)

### 7. В подключенном MySQL репозитории создать базу данных “Друзья человека”.

~~~
CREATE DATABASE Human_friends;
~~~

### 8. Создать таблицы с иерархией из диаграммы в БД.

~~~
USE Human_friends;

CREATE TABLE animal
(
   Id INT AUTO_INCREMENT PRIMARY KEY,
   Name VARCHAR(20)
);

INSERT INTO animal (Name)
VALUES ('pet'),
('pack_animal');

CREATE TABLE pet
(
   Id INT AUTO_INCREMENT PRIMARY KEY,
   Pet_name VARCHAR (20),
   Class_id INT,
   FOREIGN KEY (Class_id) REFERENCES animal (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pet (Pet_name)
VALUES ('Cat', 1),
('Dog', 1),
('Hamster', 1);

CREATE TABLE pack_animal
(
   Id INT AUTO_INCREMENT PRIMARY KEY,
   Pack_animal_name VARCHAR (20),
   Class_id INT,
   FOREIGN KEY (Class_id) REFERENCES animal (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pack_animal (Pack_animal_name)
VALUES ('Horse', 2),
('Camel', 2),
('Donkey', 2);

CREATE TABLE cat
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(20),
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id INT,
    FOREIGN KEY (Genus_id) REFERENCES pet (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE dog
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(20),
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id INT,
    FOREIGN KEY (Genus_id) REFERENCES pet (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE hamster
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(20),
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id INT,
    FOREIGN KEY (Genus_id) REFERENCES pet (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE horse
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(20),
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id INT,
    FOREIGN KEY (Genus_id) REFERENCES pack_animal (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE camel
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(20),
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id INT,
    FOREIGN KEY (Genus_id) REFERENCES pack_animal (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE donkey
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(20),
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id INT,
    FOREIGN KEY (Genus_id) REFERENCES pack_animal (Id) ON DELETE CASCADE ON UPDATE CASCADE
);
~~~

### 9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения.

~~~
INSERT INTO cat (Name, Birthday, Commands, Genus_id)
VALUES ('My', '2011-01-01', 'to eat', 1),
('Pushok', '2016-01-01', 'walk', 1),
('Nusha', '2017-01-01', 'sleep', 1);

INSERT INTO dog (Name, Birthday, Commands, Genus_id)
VALUES ('Sharik', '2020-01-01', 'for me, to lie, paw, voice', 2),
('Tuzik', '2021-06-12', 'sit, to lie, paw', 2),
('Baikal', '2021-05-10', 'sit, to lie, fu, place', 2);

INSERT INTO hamster (Name, Birthday, Commands, Genus_id)
VALUES ('Pusy', '2020-10-12', NULL, 3),
('Pestruy', '2021-03-12', NULL, 3),
('Red', '2022-05-10', NULL, 3);

INSERT INTO horse (Name, Birthday, Commands, Genus_id)
VALUES ('Lightning', '2020-01-12', 'run, step', 1),
('Fast', '2017-03-12', 'run, step', 1),
('Bullet', '2020-11-10', 'run, step', 1);

INSERT INTO camel (Name, Birthday, Commands, Genus_id)
VALUES ('Black', '2022-04-10', 'run, step', 2),
('White', '2019-03-12', 'run, step', 2),
('Camel', '2022-12-10', 'run, step', 2);

INSERT INTO donkey (Name, Birthday, Commands, Genus_id)
VALUES ('Mull', '2019-04-10', NULL, 3),
('Gosha', '2020-03-12', NULL, 3),
('Pasha', '2022-12-10', NULL, 3);
~~~

### 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

~~~
SET SQL_SAFE_UPDATES = 0;
DELETE FROM camel;

SELECT Name, Birthday, Commands FROM horse
UNION SELECT  Name, Birthday, Commands FROM donkey;
~~~

### 11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице.

### 12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

### 13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.

### 14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:

#### 14.1 Завести новое животное
#### 14.2 определять животное в правильный класс
#### 14.3 увидеть список команд, которое выполняет животное
#### 14.4 обучить животное новым командам
#### 14.5 Реализовать навигацию по меню

### 15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆int переменной̆на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведения животного заполнены все поля.