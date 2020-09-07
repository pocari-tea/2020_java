create table memTbl(
	num number primary key,
	bun number not null,
	name varchar2(20) not null,
	phone varchar2(20) not null,
	email varchar2(20) not null,
	addr varchar2(50)
)

create sequence num_seq; --num_seq.nextval

insert into MEMTBL
values( num_seq.nextval,1004, 'È«±æµ¿',
'010-1111-1111', 'bit@naver.com', '±¤ÁÖ±¤¿ª½Ã ¼­±¸ ¸Å¿ùµ¿');

select * from MEMTBL;