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