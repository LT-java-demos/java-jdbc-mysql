Java-jdbc-MySQL-demo
===============

###实现MySQL下的增、删、改、查。

IDE : IntelliJ IDEA

JDK : 1.8

测试：JUnit4

数据库工具 ： Navicat Premium

操作系统 ： macOS Sierra

----------------------
- java代码写在`src`下

- 测试写在`test`下

---------------------------------

##DB init

在`MySQL`建一张`user_table`的表

###方法一：
```
create table user_table(
id int(10) PRIMARY KEY NOT NULL auto_increment,
userId int(10),
username VARCHAR(10),
sex VARCHAR(10),
age int(10),
birthday DATE,
email VARCHAR(30),
phone VARCHAR(20)
);
```
###方法二：
执行`user_table.sql`

- DB URL:`"jdbc:mysql://localhost:3306/jdbcdemo";`

- DB USER:`"root"`

- DB PASSWORD:`"root"`


--------------------------

