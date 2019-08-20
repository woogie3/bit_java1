####################################################
Table 생성 DDL (auto commit)

테이블은 실제로 데이터들이 저장되는 곳 이라고 생각하면 이해 할 수 있으며,
CREATE TABLE 명령어를 이용해서 테이블을 생성 할수있다.
####################################################
데이터타입설명
	VARCHAR2 타입
	- 가변길이 문자형 데이터 타입 
	- 최대 길이 : 2000 바이트(반드시 길이 지정) 
	- 다른 타입에 비해 제한이 적다 
	- 일부만 입력시 뒷부분은 NULL 
	- 입력한 값의 뒷부분에 있는 BLANK도 같이 입력 
	- 전혀 값을 주지 않으면 NULL 상태 입력 
	- 지정된 길이보다 길면 입력시 에러 발생 
	- 컬럼 길이의 편차가 심한 경우, NULL 로 입력되는 경우가 많은 경우 VARCHAR2 사용 

	NUMBER 타입
	- 숫자형 데이타 타입, 음수, ZERO, 양수 저장 
	- 전체 자리수는 38자리를 넘을 수 없다 
	- 소수점이 지정되지 않았을 때 소수점이 입력되거나, 지정된 소수점자리 이상 입력되면 반올림되어 저장 
	- 지정한 정수 자리수 이상 입력시 에러 발생 
	- 연산이 필요한 컬럼은 NUMBER타입으로 지정한다. 
	- NUMBER(p,s) 로 지정시 p는 s의 자리수를 포함한 길이므로 감안하여 P의 자리수를 결정 
	- NUMBER 타입은 항상 가변길이므로 충분하게 지정할 것 

	DATE 타입
	- 일자와 시간을 저장하는 날짜형 타입 
	- 일자나 시간의 연산이 빈번한 경우 사용 
	- 포함정보 : 세기, 년도, 월, 일, 시간, 분, 초 
	- NLS_DATE_FORMAT을 이용하여 국가별 특수성을 해결 
	- 특별히 시간을 지정하지 않으면 00:00:00로 입력 됨 
	- 특별히 일자를 지정하지 않았다면 현재월의 1일로 지정 됨 
	- SYSDATE는 현재일과 시간을 제공 
	
drop table book;	
create table book( 
   bookno   number(5),
   title    varchar2(30),
   author   varchar2(30),
   pubdate  date
);

commit;
rollback;

select * from book;

insert into book values(1,'java','kim',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍','19/02/02');

insert into book (bookno,title) values(3,'db');

insert into book (bookno,title,author,pubdate) 
values(4,'db',null,null);
delete from book;
rollback;
delete from book where title='db';
delete from book where author is null;
delete from book where author = '홍';



create table book(
	bookno number(5),
	title varchar2(30),
	author varchar2(30),
	pubdate date
);

drop table book;
select * from book;
insert into book values(1,'java','kim',sysdate);
insert into book values(2,'jdbc','kim',sysdate);
insert into book values(3,'db','lee',sysdate);
insert into book values(4,'c++','park',sysdate);
insert into book values(5,'sevelet','baek','19/02/02');
commit;--확정
rollback;--commit하면 돌릴수없다!
delete from book;
delete from book where title='db';
delete from book where author is null;
delete from book where author = '홍';

desc book; --테이블구조
alter table book add(price number(7)); --컬럼추가, 자동으로 커밋처리가 된다.

insert into book(bookno,title,author,pubdate,price) values(4,'db', null,null,900);
update book set price=1000.99;
rollback;

update book set price=900 where title='db';
select * from book;

delete from book; --삭제기능을 가짐, 롤백가능
rollback;
select * from book; 
trumcate table book; --data를 자르는 기능을 가짐, 오토커밋처리됨
rollback;
select * from book; 

update book set author='~~~', price=900, pubdate=sysdate where bookno=3;

update book set price=null;
alter table book modify(price number(7,2)); --컬럼속성변경, 자동으로 커밋처리가 된다
update book set price=1000.99;
commit;

alter table book drop column price;

rename book to book2;--오토커밋처리됨
rollback;--롤백처리안됨
rename book2 to book;


#####################################################################################

select * from emp;
select * from dept;

create table emp2 as select * from emp;
create table dept2 as select * from dept;

insert into dept values(50,'EDU','SEOUL');--에러발생, 원본은 제약조건이 걸려있음
insert into dept2 values(50,'EDU','SEOUL');--정상적으로 실행됨
commit;

################################################################
--트랜잭션
################################################################
create table emp2 as select * from emp;
select * from emp2;

--창1
delete from emp2 where deptno=10;--먼저실행됨

--창2
update emp2 set comm=0 where deptno=10;--창1의 작업이 끝나야 가능
block 되는거 확인 => 창1에서 commit or rollback 명령 수행하면 lock풀림




drop table book;
create table book(
	bookno number(5) constraint scott_book_pk primary key,
	title varchar2(30) constraint scott_book_title_unique unique,
	author varchar2(30),
	price number(7,2)constraint book_price_check check(price>0),
	pubdate date default sysdate
);
select * from book;
insert into book(bookno, title, author, price, pubdate) values(1,'db','홍길동',900,sysdate);
insert into book(bookno, title, author, price, pubdate) values(2,'jsp','홍길동',-900,sysdate);--음수 에러발생
insert into book(bookno, title, author, price, pubdate) values(3,'java','김길동',1000,default);
commit;
select constraint_name from user_cons_columns where table_name='BOOK';--제약조건확인

drop table book;
create table book(
	bookno number(5)  primary key,
	title varchar2(30)  unique,
	author varchar2(30),
	price number(7,2)constraint book_price_check check(price>0),
	pubdate date default





