select * from EMP;

select ename,sal from EMP where deptno=10; 

--join 둘이상의 테이블을 합쳐 하나의 큰테이블로 만드는 방법
########################################
join
########################################
select ename,dname from emp,dept where emp.deptno = dept.deptno; --oracle전용 조인방식
select ename,dname,emp.deptno from emp,dept where emp.deptno = dept.deptno; --oracle전용 조인방식
select ename,dname,dept.deptno from emp,dept where emp.deptno = dept.deptno; --oracle전용 조인방식
select ename,d.deptno as 부서번호, dname, loc from emp e, dept d where e.deptno = d.deptno; --테이블이름을 얼라이브시켜 적용
select * from emp e, dept d where e.deptno = d.deptno;
select * from emp e, dept d where e.deptno = d.deptno and sal >2500;


########################################
ANCI join
########################################

select ename,d.deptno as 부서번호, dname, loc from emp e, dept d where e.deptno = d.deptno;

--oracle => ANCI join
select ename, d.deptno, dname, loc from emp e inner join dept d on e.deptno = d.deptno;
select ename, d.deptno, dname, loc from emp e join dept d on e.deptno = d.deptno; --inner 생략가능
--#inner join은 양쪽 테이블에 모두 있는 내용 출력
select ename, d.deptno, dname, loc from emp e join dept d on e.deptno = d.deptno where sal > 2500;




########################################
OUTER join
########################################

select ename,sal,dname,loc, e.deptno from emp e, dept d where e.deptno = d.deptno;
select ename,sal,dname,loc, e.deptno from emp e, dept d where e.deptno (+)= d.deptno;
--e.deptno에 +마킹을 하면 13개가 출력되는데, null 쪽에 마킹해야한다.

-- => ANCI 방식으로
select ename,sal,dname,loc, e.deptno from emp e join dept d on e.deptno (+)= d.deptno;
select ename,sal,dname,loc, e.deptno from emp e outer join dept d on e.deptno (+)= d.deptno;
--#right쪽이 마스터. 즉, dept테이블이 마스터 테이블이되어 모두 출력
select ename,sal,dname,loc, e.deptno from emp e right outer join dept d on e.deptno (+)= d.deptno;
--#left쪽이 마스터. 즉, emp테이블이 마스터 테이블이되어 모두 출력
select ename,sal,dname,loc, e.deptno from emp e left outer join dept d on e.deptno (+)= d.deptno;


########################################
non-equi join
########################################

select * from salgrade;
select ename, sal, grade from emp e, salgrade s where sal between losal and hisal; --fk,pk관계가 아니면 between and 관계로 처리함

-- => ANCI 방식으로

select ename, sal, grade from emp e join salgrade s on sal between losal and hisal;


########################################
--3개의 table join
########################################

select ename, sal, dname, loc, grade from emp e, salgrade s, dept d where e.deptno = d.deptno and sal between losal and hisal;
-- => ANCI 방식으로
select ename, sal, dname, loc, grade from emp e join dept d on e.deptno = d.deptno join salgrade s on sal between losal and hisal;


select ename, sal, dname, loc, grade from emp e, salgrade s, dept d where e.deptno = d.deptno and sal between losal and hisal and e.deptno =20 order by e.deptno;
-- => ANCI 방식으로
select ename, sal, dname, loc, grade from emp e join dept d on e.deptno = d.deptno join salgrade s on sal between losal and hisal order by e.deptno;

select ename, sal, dname, loc, grade from emp e join dept d on e.deptno = d.deptno join salgrade s on sal between losal and hisal where e.deptno=10 order by e.deptno;

########################################
self join
########################################

select e.empno, e.ename 사원명, e.mgr, m.empno, m.ename 상사명 from emp e, emp m where e.mgr = m.empno;
select e.empno, e.ename 사원명, e.mgr, m.empno, m.ename 상사명 from emp e, emp m where e.mgr = m.empno(+);

--ANCI 방식으로
select e.empno, e.ename 사원명, e.mgr, m.empno, m.ename 상사명 from emp e join emp m on e.mgr = m.empno;
select e.empno, e.ename 사원명, e.mgr, m.empno, m.ename 상사명 from emp e left outer join emp m on e.mgr = m.empno;
select e.empno, e.ename 사원명, e.mgr, m.empno, nvl(m.ename, 'CEO') 상사명 from emp e left outer join emp m on e.mgr = m.empno;--#null값을 가진 사원은 CEO로
select e.ename 사원명, e.sal, m.ename 상사명, m.sal from emp e join emp m on e.mgr=m.empno where e.sal > m.sal;--상사보다 급여가 많은 사원목록

########################################
--집계함수
########################################

select ename, round(sal) from emp;
select avg(sal) from emp;
select ename, avg(sal) from emp;--error!
select round(avg(sal)) 평균급여 from emp;
select count(empno), count(comm),count(*),count(mgr),round(avg(sal)) 평균급여 from emp;

select count(job) from emp;
select count(distinct job) from emp;

select sum(sal), count(*), round(avg(sal)), sum(sal)/count(*) from emp; 

select round(avg(sal)) 평균급여 from emp;
select round(avg(sal)) 평균급여 from emp where deptno=10;
select round(avg(sal)) 평균급여 from emp where deptno=20;
select round(avg(sal)) 평균급여 from emp where deptno=30;
select round(avg(sal)) 평균급여 from emp where deptno=40;

select * from emp order by deptno;

select round(avg(sal)) 평균급여 from emp group by deptno;

--## 부서이름별 평균 급여 구하기
select emp.deptno, dname, round(avg(sal)) 평균급여
from emp, dept
where emp.deptno = dept.deptno
group by dname,emp.deptno
order by 1;

select deptno, max(sal), min(sal),count(*),avg(sal)
from emp, dept

select emp.deptno, dname, round(avg(sal)) 평균급여
from emp 
	join dept
	on emp.deptno = dept.deptno
group by dname,emp.deptno
order by 1;

--##부서별 평균 급여가 2000이상인 사람
select emp.deptno, dname, round(avg(sal)) 평균급여
from emp 
	join dept
	on emp.deptno = dept.deptno
group by dname,emp.deptno
having avg(sal) > 2000
order by 1;
##############
#  순서       #
# select     #
# from       #
# where      #
# group by   #
# having     #
# order by   #
##############

select emp.deptno, dname, round(avg(sal)) 평균급여
from emp 
	join dept
	on emp.deptno = dept.deptno
where sal > 1000
group by dname,emp.deptno
having avg(sal) > 2000
order by 1;

--## FORD보다 급여를 많이 받는 사원리스트
select sal from emp where ename = 'FORD';

select * from emp where sal > 3000;
--##서브쿼리
select * from emp where sal > (select sal from emp where ename = 'FORD');

--## 평균급여보다 적게받는 사원목록
select * from emp where sal < (select avg(sal) from emp);

--## 급여가 가장적은 사람
select * from emp where sal = (select min(sal) from emp);

--## 급여가 가장 많은 사람
select * from emp where sal = (select max(sal) from emp);

###########################################
#스칼라=단일값   벡터=다중값					  #
###########################################

--## 각각의 부서에서 급여가 가장 적은 사원 리스트
select deptno, ename, sal from emp where sal in (select min(sal) from emp group by deptno);

###############################################################
# 상관관계 서브쿼리 : outer 퀄리의 컬럼중 하나가 inner쿼리문에서 사용되는 쿼리문 #
###############################################################

--## 자신이 속한 부서의 평균 급여보다 적은 사원 리스트
select * from emp outer where sal < (select avg(sal) from emp where deptno = outer.deptno);

#################
#    rownum     #
#################
select ename, sal, hiredate
from emp;

select ename, sal, hiredate from emp order by sal desc;--내림차순
select rownum, ename, sal, hiredate from (select * from emp order by sal desc); --일련번호를 부여후 정렬
select rownum, ename, sal, hiredate from (select * from emp order by sal desc) where rownum<4; --top3 뽑아냄
select rownum, ename, sal, hiredate from (select * from emp order by sal desc) where rownum>4; --1부터 생성되어 4와비교되기에 에러발생
select rownum, ename, sal, hiredate from (select * from emp order by sal desc) where rownum between 1 and 4; --top4 뽑아냄
select rownum, ename, sal, hiredate from (select * from emp order by sal desc) where rownum between 4 and 7; --1부터 생성되기에 에러가 발생함

 







