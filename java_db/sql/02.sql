select * from dept;
select * from emp;
select ename,hiredate from emp;
select ENAME,HIREDATE from emp;
SELECT ENAME,HIREDATE FROEM EMP;

desc dept;

select ename,sal from emp;
select ename,sal,comm from emp;
select ename,sal,sal*12,comm from emp;
select ename,sal,sal*12 as 연봉,comm from emp;
select ename,sal,sal*12 as "연  봉",comm from emp;

select dname, loc from dept;

--cmd : sqlpus hr/hr;
select * from employees;
select first_name, job_id, department_id from employees;


conn SCOTT/TIGER

--null을 포함한 산술식은 null
select empno, ename, sal, comm, sal+comm  from emp;
select empno, ename, sal, comm, sal+comm  월급여 from emp;

select empno, ename, sal, comm, nvl(comm,0)  from emp;
select empno, ename, sal, comm, sal+nvl(comm,0) 월급여 from emp;

select empno, ename, sal, comm, sal+nvl(comm,0) 월급여,(nvl(sal,0)+nvl(comm,0))*12 연봉 from emp;

select empno, ename, mgr, deptno from emp;
select empno, ename, nvl(mgr,0) mgr, deptno from emp;
select empno, ename, nvl(to_char(mgr),'CEO') mgr, deptno from emp;

--###문자열 연결 연산자 ||

select empno, ename,deptno from emp;
select empno||ename||deptno from emp;
select empno||'  '||ename||'  '||deptno from emp;
select empno, ename, sal||'원' from emp;


--## dual 가상의 테이블
select 10*24*24 from emp;
select 10*24*24 from dept;
select 10*24*24 from dual;

select sysdate from dual; --오늘 날짜 출력

--중복제거 (distinct)
select job from emp;
select distinct job from emp;

select deptno from dept;
select distinct deptno from dept;

--조건검색 (where)
select * from emp where deptno=20;
select * from emp where job='MANAGER';--대소문자 구분필요!!
select * from emp where LOWER(job)=LOWER('manager'); --대소문자 변환작업 LOWER(),UPPER()

select * from emp where hiredate = '81/09/28';
select * from emp where hiredate <= '81/09/28';
select * from emp where hiredate >= '81/09/28';
select * from emp where hiredate <> '81/09/28'; --(!=) == (<>)

select * from emp where deptno = 10 or deptno = 20;
select * from emp where deptno IN(20,10);
select * from emp where deptno not IN(20,10);

select * from emp where sal >= 3000 and sal <=5000;
select * from emp where sal between 3000 and 5000;
select * from emp where sal not between 3000 and 5000;

select * from dept where (deptno,loc) in((10,'DALLAS'),(30,'CHICAGO'));


--like 연산자
select * from emp;
select * from emp where ename ='ALLEN';
select * from emp where ename like 'S%';
select * from emp where ename like '%S';
select * from emp where ename like '%S%';
select * from emp where ename like '%M_T%';
select * from emp where regexp_like(ename,'A|B|C|D');--중복조건 정규식사용
select * from emp where regexp_like(ename,'[A-D]');--중복조건 정규식사용
select * from emp where regexp_like(ename,'^[A-D]');--^는 시작을 의미
select * from emp where regexp_like(ename,'[A-D]$');--$는 끝을 의미
select * from emp where hiredate like '81%';

--null값 처리
select * from emp where comm is null;
select * from emp where comm is not null;

select ename, sal, comm, sal+nvl(comm,0) total from emp where sal+nvl(comm,0) > 3000;
select ename, sal, comm, sal+nvl(comm,0) total from emp where deptno=20;

--정렬 order by
select ename , sal, comm, sal+nvl(comm,0) total, deptno from emp order by deptno;--오름차순
select ename , sal, comm, sal+nvl(comm,0) total, deptno from emp order by deptno desc;--내림차순
select ename , sal, comm, sal+nvl(comm,0) total, deptno from emp order by total;
select ename , sal, comm, sal+nvl(comm,0) total, deptno from emp order by 2;
select ename , sal, comm, sal+nvl(comm,0) total, deptno from emp order by deptno desc, total;--deptno는 내림, total은 오름
select * from emp where deptno = 30 order by sal; 
select * from emp where deptno in (20,30); 
select * from emp where deptno in (20,30) order by sal; 
select * from emp where deptno = any(20,30) order by sal; 
select * from emp where deptno != all(20,30) order by sal; --20,30제외

-- 내장함수 single row function
select * from dept;
select dname, loc from dept;
select dname,lower(dname), loc,lower(loc) from dept;
select dname,upper(dname), loc,upper(loc) from dept;

select 45.5678, 45.5678 from dual;
select round(45.5678), trunc(45.5678) from dual; --반올림(정수1자리,소수점첫자리)

select sysdate, sysdate+30 from dual;

select ename, hiredate from emp;
select ename, hiredate, substr(hiredate,1,2) 입사연도 from emp;
select sysdate, to_char(sysdate,'YYYY') from dual;--연도
select sysdate, to_char(sysdate,'YY') from dual;--연도앞 두자리
select sysdate, to_char(sysdate,'day') from dual;--요일

--emp테이블에서 사원들의 입사월을 출력
select hiredate, to_char(hiredate,'month') from emp;
select hiredate, to_char(hiredate,'mm') from emp;

select sysdate, '2019/08/14' from dual;
select sysdate, to_date('08/14/2019') from dual; --연도/월/일 순서때문에 에러발생
select sysdate, to_date('08/14/2019','mm/dd/yy') from dual;

--nvl()함수
select ename, mgr, comm from emp;
select ename, mgr, nvl(comm,'_') from emp;
select ename, mgr,nvl(to_char(comm),'_')from emp;--숫자를 문자로 변환

--nvl(a,b,c)함수2
select ename,mgr,nvl2(comm,0) from emp;
select ename,mgr,nvl2(mgr,'Y','N') 'null여부',nvl(comm,0) from emp; --null을 

--decode함수
select ename, sal, deptno, decode(deptno, 10, sal*10,
										  10, sal*2,
										  30, sal*3,
										  sal) 계산 from emp; --data를 일률적으로 정리하기에 편함
s

