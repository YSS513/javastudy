create table test(
name VARCHAR2(3),
age NUMBER(3)
)

test 테이블에 다음 값들을 입력하세요.
kim 20
lee 40
park 50
cho 23

INSERT INTO test values ('kim', 20)
INSERT INTO test values ('lee', 40)
INSERT INTO test values ('park', 50)
INSERT INTO test values ('cho', 23)
INSERT INTO test values ('kim', 33)

commit

test테이블의 모든 레코드의 모든 컬럼값을 조회하시오
select * from TEST

test테이블의 모든 레코드의 name컬럼값을 조회하시오
select name from TEST

test테이블의 모든 레코드의 age컬럼값을 조회하시오.
select age from TEST

컬럼에 별명 넣기
alias as 또는 그냥 띄고 넣어줘도됨

SELECT name as 이름, age as 나이 from TEST

select name 이름, age 나이 from TEST

test테이블에 등록된 성 씨를 모두 출력하시오.
SELECT distinct name from TEST

java collection framework....
srot....
db

나이 오름차순으로 조회
select * from test order by age asc

나이 내림차순으로 조회
select * from test order by age desc

test 테이블의 모든 레코드를 모든 컬럼이 포함되게 조회하되, 이름을 기준으로 내림차순으로 정렬하시오
select * from test order by name desc

select * from test order by name desc, age desc

select * from test where name = 'kim'

select * from test where name != 'kim'

insert into test (age) values (55)
insert into test (name) values ('pyo')
commit

name이 null인 레코드 정보를 조회하시오. 단, 컬럼은 name만 있음.
select name as 이름, age 나이 from test where name is null

name이 NULL이 아닌 레코드 정보를 조회하시오.
단, 레코드 정렬은 age 오름차순이며 만약 age가 같으면 name을 내림차순으로 정렬하시오.
select * from test where name is not NULL order by age asc, name desc

test 테이블에서 age가 55인 레코드를 조회하시오.
select * from test where age = 55

test 테이블에서 age가 55가 아닌 레코드를 조회하시오.
select * from test where age != 55

test 테이블에서 age가 null인 레코드를 조회하시오.
select * from test where age is null

test 테이블에서 age가 null이 아닌 레코드를 조회하시오.
select * from test where age is not null

test 테이블에서 age가 40보다 큰 레코드를 조회하시오.
select * from test where age > 33

test 테이블에서 age가 33보다 크거나 같은 레코드를 조회하시오.
select * from test where age >= 33

tset 테이블에서 age가 20이거나 23이거나 40인 레코드를 조회하시오.
select * from test where age = 20 or age = 23 or age = 40

test 테이블에서 age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드를 조회하시오.
select * from test where age in(20, 23, 40, 43, 61, 77)

test 테이블에서 age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드가 아닌 레코드를 조회하시오.
select * from test where age not in(20, 23, 40, 43, 61, 77)

select * from TEST

name이 kim이고 age가 33인 레코드를 조회하시오.
select * from test where name = 'kim' and age = 33

test테이블에서 age가 25보다 크고 47보다 작은 레코드를 조회하시오.
select * from test where age > 25 and age < 47

test테이블에서 age가 25보다 크거나 같고 age가 47보다 작거나 같은 레코드를 조회하시오.
select * from test where age >= 25 and age <= 47

between를 이용해서 위와 같은 결과를 더 간단하게 할 수 있다. (A and B == A부터 B까지)
select * from test where age between 25 and 47

test테이블에서 name의 첫글자는 k이고 총 3자이다. 해당 레코드를 조회하시오.
select * from test where name like 'k__'
중간에 넣어줘도 된다. like는 일부만 검색하고 싶을 때, 언더바(모르는부분)와 함께 사용하면된다.
select * from test where name like '_e_'
몇글자인지 모르면 %를 붙여준다. 하단의 예시는 o로 끝나는 것을 아는데 몇글자일지 모를 때 사용함
select * from test where name like '%o'
%=있을수도있고, 없을수도있다. 하단의 예시는 초가 들어가는 name인데 몇글자일지 모를 때 사용함
select * from test where name like '%초%'
숫자도 가능
select * from test where name like '%1%'

테이블명 대신 select문 대입하기
select * from (select * from test where age > 20) where name like '%k%'

rownum을 사용할때는 반드시 별칭을 써야한다. 하단은 2~4의 rownum 구하기
select * from 
(select rownum rnum, name, age FROM test)
where rnum between 2 and 4

select * from
(select * FROM test order by age asc)
where rnum between 2 and 4

select * from (
select rownum rnum, name, age FROM
(select rownum rnum, name, age FROM test order by age asc)
) WHERE rnum BETWEEN 2 AND 4

DB에 데이터를 저장한 상태에서 컬럼 하나만을 이용해서 특정 레코드 하나만을 조회하고 싶어.
--> 기본키 = 주키 = primary key = pk

create table member2(
id varchar2(6),
name varchar2(6),
age number(3)
)

member2 테이블의 id에 대한 키를 설정하여 중복이 되지 않도록 하기
alter table member2 add constraint pk_member2_id primary key(id)

기본키를 설정하면, 기본키에 대한 중복을 허용하지 않는다.
+ NOT NULL 제약조건도 추가가 됩니다. (NULL값을 넣을 수 없다는 말)
unique constraint

insert into member2 values ('m001', 'kim', 30)
insert into member2 values ('m002', 'kim', 30)
insert into member2 values ('m003', 'kim', 30)
insert into member2 values ('m004', 'kim', 30)
insert into member2 values ('m005', 'kim', 30)
insert into member2 values ('m006', 'kim', 30)
insert into member2 values ('m007', 'kim', 30)

insert into member2 (id, name, age)values('m008', 'lee', 44)

commit

select * from member2 where id='m004'


select * from member

member테이블의 mid를 기본키로 설정해주기!
alter table member add constraint pk_member_mid primary key(mid)

하단과 같은 두가지 방법으로 더 간편하게 기본키 설정이 가능하다.
create table test2(
id varchar2(6) primary key,
age number(3)
)

create table test3(
id varchar2(6),
age number(3),
constraint pk_test3_id primary key(id)
)

외래키 = foreign key = fk

당신이 좋아하는 음식을 다음 중에서만 고르시오.
1. 갈비
2. 떡볶이
3. 된장찌개
4. 김치찌개

나는 피자...
1~4중에서만 선택하라고 했는데, 피자를 선택하다니...
이런 일이 없도록 해보자.

고용자(부모) 테이블

create table depart(
edep varchar2(9)
)

select table depart
drop table depart

부모테이블의 edep를 기본키로 설정해주고
alter table depart add constraint pk_depart_edep primary key(edep)

자식테이블의 외래키를 부모테이블의 edep(기본키)를 참조하여 설정해줍니다.
alter table employee add constraint fk_employee_edep foreign key(edep) references depart(edep)

부모에 데이터를 추가해주면?
insert into depart values ('인사부')
insert into depart values ('홍보부')
insert into depart values ('연구실')
insert into depart values ('영업부')

위의 자료 외에는 들어갈 수 없습니다!

피고용자(자식) 테이블
create table employee(
eid varchar2(6),
ename varchar2(6),
edep varchar2(9)
)

//edep에는 인사부/홍보부/연구실/영업부만 들어갈 수 있음.

INSERT INTO employee (eid, ename, edep) values ('e001', 'kim', '인사부')
INSERT INTO employee (eid, ename, edep) values ('e002', 'lee', '홍보부')
INSERT INTO employee (eid, ename, edep) values ('e003', 'park', '연구실')
INSERT INTO employee (eid, ename, edep) values ('e004', 'choi', '영업부')

하단은 입력되지않음. 부모테이블의 데이터에 '비서실'이 없기때문. 참조무결성 제약조건 위반됨.
INSERT INTO employee (eid, ename, edep) values ('e005', 'jung', '비서실')

select * from employee
drop table employee

eid를 pk로 설정하시오.
alter table employee add constraint pk_employee_eid primary key(eid)

외래키(foreign key=fk)가 되려면, 반드시 다른 테이블의 기본키(=주키=primary key, pk)이어야 합니다.

**작업 순서는 부모테이블생성 > 부모기본키설정 > 자식테이블생성 > 외래키설정 > 부모테이블 데이터입력 > 자식테이블 데이터입력
**주의사항 : 외래키설정 전에 자식테이블에 데이터가 있으면 오류납니다.

하단은 edep의 값을 입력하지 않아서 null이지만, 외래키에는 들어갑니다.
insert into employee (eid, ename) values ('e006', 'kim')

select * from employee


메뉴, 주문 형식으로 예제 만들어보기!

// 부모 테이블
create table menu(
pizza varchar2(30),
pasta varchar2(30),
drink varchar2(20)
)
select * from menu
drop table menu

alter table menu add constraint pk_menu_pizza_pasta_drink primary key(pizza, pasta, drink)

// 자식 테이블
create table ohter(
id number(10) primary key,
pizza varchar2(30),
pasta varchar2(30),
drink varchar2(20)
)
select * from ohter
drop table ohter

alter table ohter add constraint fk_other_pizza_pasta_drink foreign key(pizza, pasta, drink) references menu(pizza, pasta, drink)

insert into menu values ('불고기피자', '토마토스파게티', '콜라')
insert into menu values ('치즈피자', '크림스파게티', '사이다')
insert into menu values ('페퍼로니피자', '로제스파게티', '마운틴듀')

insert into ohter values (1, '불고기피자', '토마토스파게티', '콜라')
insert into ohter values (2, '치즈피자', '크림스파게티', '사이다')
insert into ohter values (3, '페퍼로니피자', '로제스파게티', '마운틴듀')
insert into ohter values (4, '불고기피자', '토마토스파게티', '콜라')

insert into ohter values (5, '불고기피자', '크림스파게티', '사이다')

select * from member



