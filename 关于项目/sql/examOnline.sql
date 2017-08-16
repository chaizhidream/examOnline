/*创建数据库*/
drop database if exists examOnline; 
create database examOnline;

/*进入对应数据库*/
use examOnline;


/*学生信息表*/
create table student(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
    name varchar(16) not null,
    sex varchar(4),
	studentclass  varchar(16) not null,
    telephone varchar(50),
    email varchar(100),
    ru int default 3,
    primary key(id)
);


/*教师信息表*/
create table teacher(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
    name varchar(16) not null,
    sex varchar(4),
    telephone varchar(50),
    email varchar(100),
    ru int default 2,
    primary key(id)
);

/*管理员信息表*/
create table manager(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
    name varchar(16) not null,
    sex varchar(4),
    telephone varchar(50),
    email varchar(100),
    ru int default 1,
    primary key(id)
);



/*选择题表*/
create table xzt(
    id int not null auto_increment,
    question varchar(1000) not null,
	answer varchar(4) not null,
	optionA varchar(100) not null,
	optionB varchar(100) not null,
	optionC varchar(100) ,
	optionD varchar(100) ,
	questiontype int default 1,
    questionpoint varchar(16),	
    primary key(id)
);


/*填空题表*/
create table tkt(
    id int not null auto_increment,
    question varchar(1000) not null,
	answer varchar(100) not null,
	questiontype int default 2,
    questionpoint varchar(16),	
    primary key(id)
);

/*编程题表*/
create table bct(
    id int not null auto_increment,
    question varchar(1000) not null,
	questiontype int default 3,
    questionpoint varchar(16),	
    primary key(id)
);

/*编程题答案表*/
create table bctanswer(
    id int not null auto_increment,
    username varchar(100) not null,
	papername varchar(16),
    answerpath1 varchar(100),
    answerpath2 varchar(100),
    primary key(id)
);


/*试卷表*/
create table paper(
    id int not null auto_increment,
    starttime datetime,
    endtime datetime,
    papername varchar(16) not null unique,
    xzt1 int not null,
    xzt2 int not null,
    xzt3 int not null,
    xzt4 int not null,
    xzt5 int not null,
    xzt6 int not null,
    xzt7 int not null,
    xzt8 int not null,
    xzt9 int not null,
    xzt10 int not null,
    tkt1 int not null,
    tkt2 int not null,
    tkt3 int not null,
    tkt4 int not null,
    tkt5 int not null,
    bct1 int not null,
    bct2 int not null,
    primary key(id)
);



/*学生成绩表*/
create table studentgrade(
    id int not null auto_increment,
    username varchar(16) not null,
	xztscore int default 0,
	tktscore int default 0,
	bctscore int ,
	papername varchar(16) not null,
    primary key(id)
);



/*错题表*/
create table mistakes(
    id int not null auto_increment,
    username varchar(100) not null,
    questiontype varchar(16),
	questionpoint int,
    primary key(id)
);





/*添加外键约束*/
/*alter table 表名 add foreign key(qId) references QUESTIONS(id); */



/*备份数据库*/
/*mysqldump -u root -p123456 examonline-> C:\backup.sql*/


/*还原数据库*/
/*mysql -u root -p123456 < C:\backup.sql*/


/*开启MySQL的远程帐号-2）创建远程登陆用户并授权*/
/*如果想不限制链接的 IP 则设置为“%”即可。*/
/*grant all PRIVILEGES on 数据库名/数据表名 to root@'192.168.1.101'  identified by '123456';*/