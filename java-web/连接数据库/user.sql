create table t_user(
	id int  IDENTITY(1,1) primary key,
	username nchar(20) ,
	gender nchar(10),
	age nchar(20),
	birth nchar(50),
	pwd nchar(50),
)
drop table t_user 
delete from t_user