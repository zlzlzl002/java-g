/*
oracle ������ ���̽���ġ(oracle xe)  �Է� ���� ���� ��Ϻҷ�����(select) 
�ַ�����: number string date   |  file �� �߻����� 
��й�ȣ oracle
cmd                           name  VARCHAR2(10)  (10)�� byte �� ǥ����  name='�豸��' �� 9 byte �ϱ� �ѱ��ڴ� 3byte
1. sqlplus
2. ����ڸ�: system
3. ��ȣ: oracle
4. CREATE USER scott(����) IDENTIFIED BY tiger(��й�ȣ); ����� ����
5. GRANT connet,resource TO scott;   ���ӱ���
6. conn scott/tiger     system �������� scott/tiger�� 
7. Table ����¹�         ������ �빮��(oracle ���� Ư���� �ؼ��ϴ� ���)
CREATE TABLE  member(num NUMBER, name VARCHAR2(10), addr VARCHAR2(20));  ()�� 3�� ���� Į���� 3����
8. Table Ȯ�� �ϴ¹�� : DESC talbe name;           ex) DESC member 
8. data �����ϴ¹� 
INSERT INTO ���̺�� ( num, name, addr ) VALUES(1, '�豸��', '�뷮��');  <= row 
INSERT INTO ���̺�� ( num, name, addr) VALUES(test_seq.NEXTVAL,'a',b');
9. table ����� ��Ϻ���  SELECT Į���� FROM ���̺��
SELECT num,name,addr FROM member;
9.0 table ����� ��� where �� SELECT �ϱ�
SELECT * FROM ���̺�� WHERE num= ;
10. table row ����� ���      ex) DELETE FROM member WHERE num=2;  ��ȣ�� 2���� row ����
- num ����¹� DELETE FROM table�� WHERE num=2;  oracle ������ = �� �񱳿������̴�.
- name ����¹� DELETE FROM table�� WHERE name='';  ex) name='�豸��';
11. Į�� �ȿ��ִ� ���� �����ϱ�    EX) UPDATE member SET name='�����' WHERE num=1;
UPDATE member SET name='' WHERE num=1;      
12. ���̺� ���� DROP TABLE ���̺��;  
13. table ���鶧 ���̵� �ֱ�  	EX)  num=1;  ���� 2�� ����x
CREATE TABLE member(num NUMBER PRIMARY KEY, name VARCHAR2(10), addr VARCHAR2(20);
14. table ���� �ϱ�
SELECT * FROM ���̺��̸� ORDER BY Į���̸� ASC(��������); DESC(��������);
CREATE SEQUENCE test_seq; 
SELECT �÷���,test_seq.NEXTVAL FROM ���̺��;
15. table �÷� �������
ALTER TABLE ���̺�� Modify(�߰��� Ÿ��);
16. Į�� ���� �����ϱ� ��������
SET LINESIZE 2000;     | VARCHAR(30) �̶��Ҷ� ������ �Ѿ�°��� ���������� �����ִ� ����
SET PAGESIZE 100; -- ���������� �������� �ο��
17. ���̺� ������ �ٲٱ�.


[������]
������ ����
CREATE SEQUENCE ���̺��_seq;
������ ����
DROP SEQUENCE test_seq;
JAVA ������ OJDBC6 ���� �����ؼ� jdk1  jre lib ext ���� ���� �ؼ� �־��ֱ�
								jre1 �������� lib ext ���� �����ؼ� �־��ּ���
ResultSet  <=  PreparedStatement (select)  = > Connection = > Oracle DataBase
				   				    < =               < =		

���� �ٽ�Ű��
sqlplus system/oracle  | system ��������
sqlplus scott/tiger      | scott ��������

client WebBrowser = > java application = > DB
                  get ���

[Table] 
member 
[ num number | name String | add string ]
[          row 1                                 ]  ȸ�������� �����Ҷ����� row �������.
[          row 2                                 ]                         ]
 */
