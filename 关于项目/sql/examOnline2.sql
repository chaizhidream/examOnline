/*用户信息*/
create table USER_INFO(
    id int not null auto_increment,
    username varchar(16) not null,unique,
    pwd varchar(16) not null,
    name varchar(16) not null,
    sex char(2),
    telephone varchar(50),
    email varchar(100),
    remark text,
    primary key(id)
);

/*题目*/
create table QUESTIONS(
    id int not null auto_increment,
    qName varchar(100) not null,
    qAnswer char(1) not null,
    primary key(id)
);

/*题目选项*/
create table OPTIONS(
    id int not null auto_increment,
    oNO char(1) not null,
    oName varchar(100) not null,
    qId int ,
    primary key(id)
);

alter table OPTIONS add foreign key(qId) references QUESTIONS(id); 

/*考试表*/
create table TEST_PAPER(
    id int not null auto_increment,
    tName varchar(100) not null,
    startTime datetime,
    endTime datetime,
    primary key(id)
);

create table TEST_QUESTIONS(
    tId int ,
    qId int
);

alter table TEST_QUESTIONS  add foreign key(qId) references QUESTIONS(id); 
alter table TEST_QUESTIONS  add foreign key(tId) references TEST_PAPER(id); 


create table TEST_RESULT(
    id int not null auto_increment,
    tId int ,
    userId int,
    mark float,
    primary key(id)
);

alter table TEST_RESULT  add foreign key(userId) references USER_INFO(id); 
alter table TEST_RESULT  add foreign key(tId) references TEST_PAPER(id); 