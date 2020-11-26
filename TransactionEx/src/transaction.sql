CREATE TABLE account(
id varchar2(3) primary key,
balance number
)

kim:0
lee:10000

INSERT INTO ACCOUNT (id, balance) VALUES ('kim', 0)
INSERT INTO ACCOUNT (id, balance) VALUES ('lee', 10000)
COMMIT

SELECT * FROM account

kim이 lee한테 10000원만 빌려줘
lee가 빌려줍니다.
----> kim의 balance는 10000
lee의 balance 0
--->
kim이 lee한테 10000원 갚습니다.
kim의 레코드에서 balance값이 0
----------------------------------- 전산에서 전원이 나갔다...!
lee의 레코드에서 balance값이 10000

====> lee의 balance 0 복구

------------------------------------------------------------
주문을 하면 해당 회원에게 10포인트를 준다.
>> 주문 테이블에 레코드가 추가되면, 회원 테이블의 특정 레코드의 point 컬럼 값이 변한다

CREATE TABLE member10(
mid varchar2(3) primary key,
point number
)

INSERT INTO member10 VALUES ('kim', 0)
INSERT INTO member10 VALUES ('lee', 0)

CREATE TABLE oder(
oid varchar2(3) primary key,
menu varchar2(10) NOT NULL,
mid varchar2(3)
)

SELECT * FROM member10
SELECT * FROM oder

