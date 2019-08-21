SET SERVEROUTPUT ON ;

Create Procedure SALARY_CAL
    실행가능한 모듈이 데이터베이스에 만들어진다.  
   
##############################
   Procedure
##############################
create or replace procedure update_sal(v_empno in number)
is
begin
 update emp
 set sal=sal*1.1
 where empno=v_empno;
end;
/

execute update_sal(7369);
commit;

drop procedure update_sal;


*******************

Drop table book;

CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);

Drop PROCEDURE InsertBook;

CREATE OR REPLACE PROCEDURE InsertBook(
    myBookID IN NUMBER,
     myBookName IN VARCHAR2,
     myPublisher IN VARCHAR2,
     myPrice IN NUMBER)
 AS
 BEGIN
      INSERT INTO Book(bookid, bookname, publisher, price)
      VALUES(myBookID, myBookName, myPublisher, myPrice);
 END;
/


EXEC InsertBook(1, '스포츠과학', '마당과학서적', 25000);

SELECT * FROM Book;

**********************************
동일한 도서가 있는지 점검한 후 
삽입하는 프로시저(BookInsertOrUpdate)

CREATE OR REPLACE PROCEDURE BookInsertOrUpdate(
    myBookID NUMBER,
    myBookName VARCHAR2,
    myPublisher VARCHAR2,
    myPrice INT)
 AS
    mycount NUMBER;
 BEGIN
   SELECT COUNT(*) INTO mycount FROM Book
     WHERE bookname LIKE myBookName;
   IF mycount!=0 THEN
     UPDATE Book SET price = myPrice
       WHERE bookname LIKE myBookName;
   ELSE
     INSERT INTO Book(bookid, bookname, publisher, price)
       VALUES(myBookID, myBookName, myPublisher, myPrice);
   END IF;
 END;
/

EXEC BookInsertOrUpdate(2, '스포츠 즐거움', '마당과학서적', 25000);
SELECT * FROM Book; 
/* 2번 투플 삽입 결과 확인 */


EXEC BookInsertOrUpdate(2, '스포츠 즐거움', '마당과학서적', 20000);
SELECT * FROM Book; 
/* 2번 투플 가격 변경 확인 */



##############################
function
###############################
drop function fn_update_sal;

create or replace function fn_update_sal(v_empno in number)
return number
is
 v_sal number;
begin
 update emp  set sal=sal*1.1  where empno=v_empno;

 select sal into v_sal from emp where empno=v_empno;
 return v_sal;
end;
/

var salary number;
execute :salary := fn_update_sal(7839)
print salary;


####################################
trigger
####################################


create table item(
  code char(6) primary key, --물품 코드
  name varchar2(15) not null,
  company varchar2(15),
  price number(8),
  cnt number default 0 -- 재고 수량  
);


create table warehouse(
   num number(6) primary key, --입고 번호
   code char(6) references item(code),
   indate date default sysdate, --입고날짜
   incnt number(6),
   inprice number(6),
   totalprice number(8)
);

insert into item(code, name, company, price)
values('c0001', '에어콘', '삼성', 1000000);

insert into item(code, name, company, price)
values('c0002', '선풍기', 'LG', 50000);

commit;

SELECT * FROM item;

--재고수량 갱신하기위한 트리거 생성
create or replace trigger cnt_add
after insert on warehouse
for each row
  begin
     update item set cnt = cnt+:new.incnt
     where code=:new.code; --new 선언은 insert문, update문에서만 사용
end;
/


insert into warehouse(num, code, incnt, inprice, totalprice)
values(1,'c0001',10, 900000, 9000000 );

SELECT * FROM item;
SELECT * FROM warehouse;

#################################################
trigger  book  p270
################################################
set serveroutput on;


CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);



 CREATE TABLE Book_log(
    bookid_l NUMBER,
    bookname_l VARCHAR2(40),
    publisher_l VARCHAR2(40),
    price_l NUMBER
 );

         
CREATE OR REPLACE TRIGGER AfterInsertBook
     AFTER INSERT ON Book FOR EACH ROW
     DECLARE
         average NUMBER;
     BEGIN
        INSERT INTO Book_log
           VALUES(:new.bookid, :new.bookname, :new.publisher, :new.price);
        DBMS_OUTPUT.PUT_LINE('삽입 투플을 Book_log 테이블에 백업..');
     END;
/

set serveroutput on;


INSERT INTO Book VALUES(3, '스포츠 과학 1', '이상미디어', 25000);
SELECT * FROM Book WHERE bookid='3';
SELECT * FROM Book_log WHERE bookid_l='3';                /* 결과 확인 */


         
######################################################################
CURSOR 
######################################################################

drop PROCEDURE Interest;
CREATE OR REPLACE PROCEDURE Interest
 AS
    myInterest NUMERIC;
    Price NUMERIC;
    CURSOR InterestCursor IS SELECT saleprice FROM Orders;
 BEGIN
   myInterest := 0.0;
   OPEN InterestCursor;
   LOOP
       FETCH InterestCursor INTO Price;
       EXIT WHEN InterestCursor%NOTFOUND;
       IF Price >= 30000 THEN
           myInterest := myInterest + Price * 0.1;
       ELSE
           myInterest := myInterest + Price * 0.05;
       END IF;
    END LOOP;
    CLOSE InterestCursor;
    DBMS_OUTPUT.PUT_LINE(' 전체 이익 금액 = ' || myInterest);
 END;
 /


##########################################
FUNCTION
########################################
CREATE OR REPLACE FUNCTION fnc_Interest(
    price NUMBER) RETURN INT
  IS
     myInterest NUMBER;
  BEGIN
  /* 가격이 30,000원 이상이면 10%, 30,000원 미만이면 5% */
    IF Price >= 30000 THEN myInterest := Price * 0.1;
    ELSE myInterest := Price * 0.05;
   END IF;
   RETURN myInterest;
  END;

SELECT custid, orderid, saleprice, fnc_Interest(saleprice) interest
    FROM Orders;
