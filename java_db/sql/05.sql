###################################
view
###################################

select ename,sal, d.deptno,dname,loc from emp e, dept d where e.deptno = d.deptno;

create or replace view emp_dept
as
select ename,sal, d.deptno,dname,loc from emp e, dept d where e.deptno = d.deptno; --뷰 권한 에러발생

conn system/1234;
grant dba to SCOTT;
conn SCOTT/TIGER;

create or replace view emp_dept
as
select ename,sal, d.deptno,dname,loc from emp e, dept d where e.deptno = d.deptno;--오토커밋됨

select * from emp_dept;

drop view emp_dept;

create or replace view emp_dept
as
select ename,sal, d.deptno,dname,loc from emp e, dept d where e.deptno = d.deptno;
select * from emp_dept;
select * from tab;
select user from dual;

--자기가 속한 부서의 평균 급여보다 작게 받는 사람들의 명단을 뷰로 만드시오. 뷰네임=minsalavg
drop view minsalavg;
create or replace view minsalavg
as
select ename, sal, deptno from emp outer where sal < (select avg(sal) from emp where deptno = outer.deptno);
select * from minsalavg;

--자기가 속한 부서의 평균 급여보다 많이 받는 사람들의 명단을 뷰로 만드시오. 뷰네임=highsalavg
drop view highsalavg;
create or replace view highsalavg
as
select ename, sal, deptno from emp outer where sal > (select avg(sal) from emp where deptno = outer.deptno);
select * from highsalavg;


###################################################
sequence
###################################################

delete from dept2;

create sequence deptno_seq;

insert into dept2(deptno,dname,loc) values(deptno_seq.nextval,'인사부','bit'); --deptno 번호 자동부여
select deptno_seq.currval from dual;

drop sequence deptno_seq;

create sequence deptno_seq start with 10 increment by 10; --10부터 10씩 증가
insert into dept2(deptno,dname,loc) values(deptno_seq.nextval,'인사부','bit');
select * from dept2;
select deptno_seq.currval from dual;

delete from dpet2;
commit;

insert into dept2(deptno,dname,loc) values(?????,'인사부','bit');
select max(deptno)+10 from dept;

select nvl(max(deptno),0)+10 from dept2; --null일 경우
insert into dept2(deptno,dname,loc) values((select nvl(max(deptno),0)+10 from dept2),'인사부','bit');


#########################################################
index
#########################################################

select * from dept;
select * from emp;

set autotrace on;--실행계획 출력

select * from emp where empno=7698; --index 기반
select * from emp where ename='FORD'; --full scan 기반

--pk아닌 인덱스 출력
create index emp_ename_idx on emp(ename);
drop index emp_ename_idx;

set autotrace off; --실행계획출력 취소

select index_name, table_name from user_indexes;

#########################################################
backup
#########################################################

e:
sqlplus "/as sysdba"
create or deplace directory mdbackup as 'e:\backup';
GRANT READ,wirte on directory mdbackup to madang;
EXPDP madang/madang directory=mdbackup dumpfile=madang_20140701.dmp;

sqlplus madang/madang
drop table orders;
select * from orders;
exit;
IMPDP madang/madang directory=mdbackup
dumpfile = madang_20140701.dmp TABLES=orders

select * from Orders;


##############################################################
08_21_과제
##############################################################
create table users(
	id varchar2(10) not null,
	password varchar2(30) not null,
	name varchar2(5) not null,
	role varchar2(20)
	);
ALTER TABLE users ADD CONSTRAINT users_pk PRIMARY KEY (id);
create sequence Seq_seq;
create table board(
	seq integer not null,
	title varchar2(20),
	content varchar2(1000),
	regdate date,
	cnt integer,
	id varchar2(10)
);
ALTER TABLE board
    ADD CONSTRAINT board_users_fk FOREIGN KEY (id)
        REFERENCES users (id)
    NOT DEFERRABLE;

    
--회원등록
insert into users values('user1','1q2w','홍길동','학생');
insert into users values('user2','3e4r','이길동','학생');
insert into users values('user3','3333','박길동','학생');
insert into users values('user4','4444','홍길동','학생');
--회원정보수정
update users set password='1q2w3e' where id='user1';
update users set name='김길동' where id='user1';
update users set role='군인' where id='user1';
--로그인

--게시판 글 등록

--글수정

--글삭제

--데이터검색

--전체 글 등록수

--사용자별 글 등록수

--월별 게시글 수

--게시글검색(옵션:사용자별)

--게시글검색(옵션:제목)
	
	
	
	
	
	
	
	