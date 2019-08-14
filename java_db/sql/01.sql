
alter user hr identified by hr account unlock;

sqlplus hr/hr

select * from tab;

--tablespace 생성
create tablespace bit
datafile 'c:\lib\bit.dbf'
size 30M
autoextend on next 2M maxsize UNLIMITED;

--계정생성
create user test01 identified by 1234;
default tablespace bit;
--계정삭제 cascade는 연쇄삭제!
drop user test01 cascade;
--권한부여
grant connect to test01;
--권한해제
revoke connect from test01;
--테이블생성 및 자원사용 권한 부여
grant connect, resource to test01;
--계정생성
create user SCOTT identified by TIGER;
default tablespace bit;


GRANT CONNECT, RESOURCE TO SCOTT BY TIGER;

alter user SCOTT default TABLESPACE bit;
alter user SCOTT temporary TABLESPACE temp;

@c:\lib\scott.sql


--오라클 휴지통비우기
purge recyclebin;

select TABLESPACE_name form dba_TABLESPACE;
show linesize;
linesize 300;





