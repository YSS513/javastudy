create table test(
name VARCHAR2(3),
age NUMBER(3)
)

test ���̺� ���� ������ �Է��ϼ���.
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

test���̺��� ��� ���ڵ��� ��� �÷����� ��ȸ�Ͻÿ�
select * from TEST

test���̺��� ��� ���ڵ��� name�÷����� ��ȸ�Ͻÿ�
select name from TEST

test���̺��� ��� ���ڵ��� age�÷����� ��ȸ�Ͻÿ�.
select age from TEST

�÷��� ���� �ֱ�
alias as �Ǵ� �׳� ��� �־��൵��

SELECT name as �̸�, age as ���� from TEST

select name �̸�, age ���� from TEST

test���̺� ��ϵ� �� ���� ��� ����Ͻÿ�.
SELECT distinct name from TEST

java collection framework....
srot....
db

���� ������������ ��ȸ
select * from test order by age asc

���� ������������ ��ȸ
select * from test order by age desc

test ���̺��� ��� ���ڵ带 ��� �÷��� ���Եǰ� ��ȸ�ϵ�, �̸��� �������� ������������ �����Ͻÿ�
select * from test order by name desc

select * from test order by name desc, age desc

select * from test where name = 'kim'

select * from test where name != 'kim'

insert into test (age) values (55)
insert into test (name) values ('pyo')
commit

name�� null�� ���ڵ� ������ ��ȸ�Ͻÿ�. ��, �÷��� name�� ����.
select name as �̸�, age ���� from test where name is null

name�� NULL�� �ƴ� ���ڵ� ������ ��ȸ�Ͻÿ�.
��, ���ڵ� ������ age ���������̸� ���� age�� ������ name�� ������������ �����Ͻÿ�.
select * from test where name is not NULL order by age asc, name desc

test ���̺��� age�� 55�� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age = 55

test ���̺��� age�� 55�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age != 55

test ���̺��� age�� null�� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age is null

test ���̺��� age�� null�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age is not null

test ���̺��� age�� 40���� ū ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age > 33

test ���̺��� age�� 33���� ũ�ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age >= 33

tset ���̺��� age�� 20�̰ų� 23�̰ų� 40�� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age = 20 or age = 23 or age = 40

test ���̺��� age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age in(20, 23, 40, 43, 61, 77)

test ���̺��� age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ尡 �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age not in(20, 23, 40, 43, 61, 77)

select * from TEST

name�� kim�̰� age�� 33�� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where name = 'kim' and age = 33

test���̺��� age�� 25���� ũ�� 47���� ���� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age > 25 and age < 47

test���̺��� age�� 25���� ũ�ų� ���� age�� 47���� �۰ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where age >= 25 and age <= 47

between�� �̿��ؼ� ���� ���� ����� �� �����ϰ� �� �� �ִ�. (A and B == A���� B����)
select * from test where age between 25 and 47

test���̺��� name�� ù���ڴ� k�̰� �� 3���̴�. �ش� ���ڵ带 ��ȸ�Ͻÿ�.
select * from test where name like 'k__'
�߰��� �־��൵ �ȴ�. like�� �Ϻθ� �˻��ϰ� ���� ��, �����(�𸣴ºκ�)�� �Բ� ����ϸ�ȴ�.
select * from test where name like '_e_'
��������� �𸣸� %�� �ٿ��ش�. �ϴ��� ���ô� o�� ������ ���� �ƴµ� ��������� �� �� �����
select * from test where name like '%o'
%=���������ְ�, ���������ִ�. �ϴ��� ���ô� �ʰ� ���� name�ε� ��������� �� �� �����
select * from test where name like '%��%'
���ڵ� ����
select * from test where name like '%1%'

���̺�� ��� select�� �����ϱ�
select * from (select * from test where age > 20) where name like '%k%'

rownum�� ����Ҷ��� �ݵ�� ��Ī�� ����Ѵ�. �ϴ��� 2~4�� rownum ���ϱ�
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