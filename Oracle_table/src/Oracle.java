/*
oracle ������ ���̽���ġ(oracle xe)  �Է� ���� ���� ��Ϻҷ�����(select) 
�ַ�����: number string date   |  file �� �߻����� 
��й�ȣ oracle
cmd 
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
INSERT INTO member ( num, name, addr ) VALUES(1, '�豸��', '�뷮��');  <= row 
9. table ����� ��Ϻ���  SELECT Į���� FROM ���̺��
SELECT num,name,addr FROM member;
10. table row ����� ���      ex) DELETE FROM member WHERE num=2;  ��ȣ�� 2���� row ����
- num ����¹� DELETE FROM table�� WHERE num=2;  oracle ������ = �� �񱳿������̴�.
- name ����¹� DELETE FROM table�� WHERE name='';  ex) name='�豸��';
11. Į�� �ȿ��ִ� ���� �����ϱ�    EX) UPDATE member SET name='�����' WHERE num=1;
UPDATE member SET name='' WHERE num=1;      
12. ���̺� ���� DROP TABLE ���̺��;  
13. table ���鶧 ���̵� �ֱ�  	EX)  num=1;  ���� 2�� ����x
CREATE TABLE member(num NUMBER PRIMARY KEY, name VARCHAR2(10), addr VARCHAR2(20);


���� �ٽ�Ű��
sqlplus system/oracle  | system ��������
sqlplus scott/tiger      | scott ��������

client WebBrowser = > java application = > DB
                  get ���

[Table] 
member 
[ num number | name String | add string ]
[          row 1                                 ]  ȸ�������� �����Ҷ����� row �������.
[          row 2                                 ]                               ]
 */
