drop table seq if exists;
create table seq(
    val int(10),
    name varchar(20),
    primary key(val)
);

insert into seq values (1, 'default');

