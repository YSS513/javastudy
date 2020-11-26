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

DB�� �����͸� ������ ���¿��� �÷� �ϳ����� �̿��ؼ� Ư�� ���ڵ� �ϳ����� ��ȸ�ϰ� �;�.
--> �⺻Ű = ��Ű = primary key = pk

create table member2(
id varchar2(6),
name varchar2(6),
age number(3)
)

member2 ���̺��� id�� ���� Ű�� �����Ͽ� �ߺ��� ���� �ʵ��� �ϱ�
alter table member2 add constraint pk_member2_id primary key(id)

�⺻Ű�� �����ϸ�, �⺻Ű�� ���� �ߺ��� ������� �ʴ´�.
+ NOT NULL �������ǵ� �߰��� �˴ϴ�. (NULL���� ���� �� ���ٴ� ��)
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

member���̺��� mid�� �⺻Ű�� �������ֱ�!
alter table member add constraint pk_member_mid primary key(mid)

�ϴܰ� ���� �ΰ��� ������� �� �����ϰ� �⺻Ű ������ �����ϴ�.
create table test2(
id varchar2(6) primary key,
age number(3)
)

create table test3(
id varchar2(6),
age number(3),
constraint pk_test3_id primary key(id)
)

�ܷ�Ű = foreign key = fk

����� �����ϴ� ������ ���� �߿����� ���ÿ�.
1. ����
2. ������
3. �����
4. ��ġ�

���� ����...
1~4�߿����� �����϶�� �ߴµ�, ���ڸ� �����ϴٴ�...
�̷� ���� ������ �غ���.

�����(�θ�) ���̺�

create table depart(
edep varchar2(9)
)

select table depart
drop table depart

�θ����̺��� edep�� �⺻Ű�� �������ְ�
alter table depart add constraint pk_depart_edep primary key(edep)

�ڽ����̺��� �ܷ�Ű�� �θ����̺��� edep(�⺻Ű)�� �����Ͽ� �������ݴϴ�.
alter table employee add constraint fk_employee_edep foreign key(edep) references depart(edep)

�θ� �����͸� �߰����ָ�?
insert into depart values ('�λ��')
insert into depart values ('ȫ����')
insert into depart values ('������')
insert into depart values ('������')

���� �ڷ� �ܿ��� �� �� �����ϴ�!

�ǰ����(�ڽ�) ���̺�
create table employee(
eid varchar2(6),
ename varchar2(6),
edep varchar2(9)
)

//edep���� �λ��/ȫ����/������/�����θ� �� �� ����.

INSERT INTO employee (eid, ename, edep) values ('e001', 'kim', '�λ��')
INSERT INTO employee (eid, ename, edep) values ('e002', 'lee', 'ȫ����')
INSERT INTO employee (eid, ename, edep) values ('e003', 'park', '������')
INSERT INTO employee (eid, ename, edep) values ('e004', 'choi', '������')

�ϴ��� �Էµ�������. �θ����̺��� �����Ϳ� '�񼭽�'�� ���⶧��. �������Ἲ �������� ���ݵ�.
INSERT INTO employee (eid, ename, edep) values ('e005', 'jung', '�񼭽�')

select * from employee
drop table employee

eid�� pk�� �����Ͻÿ�.
alter table employee add constraint pk_employee_eid primary key(eid)

�ܷ�Ű(foreign key=fk)�� �Ƿ���, �ݵ�� �ٸ� ���̺��� �⺻Ű(=��Ű=primary key, pk)�̾�� �մϴ�.

**�۾� ������ �θ����̺���� > �θ�⺻Ű���� > �ڽ����̺���� > �ܷ�Ű���� > �θ����̺� �������Է� > �ڽ����̺� �������Է�
**���ǻ��� : �ܷ�Ű���� ���� �ڽ����̺� �����Ͱ� ������ �������ϴ�.

�ϴ��� edep�� ���� �Է����� �ʾƼ� null������, �ܷ�Ű���� ���ϴ�.
insert into employee (eid, ename) values ('e006', 'kim')

select * from employee


�޴�, �ֹ� �������� ���� ������!

// �θ� ���̺�
create table menu(
pizza varchar2(30),
pasta varchar2(30),
drink varchar2(20)
)
select * from menu
drop table menu

alter table menu add constraint pk_menu_pizza_pasta_drink primary key(pizza, pasta, drink)

// �ڽ� ���̺�
create table ohter(
id number(10) primary key,
pizza varchar2(30),
pasta varchar2(30),
drink varchar2(20)
)
select * from ohter
drop table ohter

alter table ohter add constraint fk_other_pizza_pasta_drink foreign key(pizza, pasta, drink) references menu(pizza, pasta, drink)

insert into menu values ('�Ұ������', '�丶�佺�İ�Ƽ', '�ݶ�')
insert into menu values ('ġ������', 'ũ�����İ�Ƽ', '���̴�')
insert into menu values ('���۷δ�����', '�������İ�Ƽ', '����ƾ��')

insert into ohter values (1, '�Ұ������', '�丶�佺�İ�Ƽ', '�ݶ�')
insert into ohter values (2, 'ġ������', 'ũ�����İ�Ƽ', '���̴�')
insert into ohter values (3, '���۷δ�����', '�������İ�Ƽ', '����ƾ��')
insert into ohter values (4, '�Ұ������', '�丶�佺�İ�Ƽ', '�ݶ�')

insert into ohter values (5, '�Ұ������', 'ũ�����İ�Ƽ', '���̴�')

select * from member



