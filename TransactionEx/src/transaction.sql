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

kim�� lee���� 10000���� ������
lee�� �����ݴϴ�.
----> kim�� balance�� 10000
lee�� balance 0
--->
kim�� lee���� 10000�� �����ϴ�.
kim�� ���ڵ忡�� balance���� 0
----------------------------------- ���꿡�� ������ ������...!
lee�� ���ڵ忡�� balance���� 10000

====> lee�� balance 0 ����

------------------------------------------------------------
�ֹ��� �ϸ� �ش� ȸ������ 10����Ʈ�� �ش�.
>> �ֹ� ���̺� ���ڵ尡 �߰��Ǹ�, ȸ�� ���̺��� Ư�� ���ڵ��� point �÷� ���� ���Ѵ�

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

