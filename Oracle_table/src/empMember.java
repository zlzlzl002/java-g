/*
DB
1.C:\oraclexe\app\oracle\product\10.2.0\server\RDBMS\ADMIN\scott.sql
2.desc emp

emp ���̺� (��� ���̺�)
empno => �����ȣ
ename => ��� �̸�
job => ��å
mgr => �޴����� ���(���� ����� �����ȣ)
hiredate  => �Ի���
sal => �޿�
comm => ������(���ʽ�)
deptno => �μ���ȣ
                                    
SELET                             
FROM ���̺��                 
WHERE ������                  
GROUP BY Į����
HAVING ������             
ORDER BY Į���� ASC|DESC ���� ����  

�������
FROM => WHERE => SELECT => ORDER
ORACLE �񱳿����ڷ� NULL ���Ҽ� ����   IS NULL | IS NOT NULL ����ؼ� �� �Ҽ� �ִ�.
EX) SELECT ENAME,JOB FROM EMP WHERE COMM IS NULL;
SELECT ENAME,JOB FROM EMP WHERE COMM IS NOT NULL;

1. EMP ���̺��� �����ȣ, ����̸�, ������ ����� ������.
SELECT empno,ename,job FROM emp;	
2. emp ���̺��� �����ȣ, �޿�, �μ���ȣ�� ����� ������.
��, �޿��� ���� ������� ���
SELECT empno,sal,deptno FROM emp ORDER BY sal DESC;
3. emp ���̺��� �����ȣ, �޿�, �Ի����� ����� ������.
��, �޿��� ���� ������� ���
SELECT empno,sal,hiredate FROM emp ORDER BY SAL ASC;
4. emp ���̺��� ����,�޿��� ����غ�����
��, ���������� ��������, �޿��� �������� ������ ������. 
SELECT job,sal FROM emp ORDER BY job ASC, sal DESC;
5. �޿��� 2000 �̻��� ����� �����ȣ, �̸�, �޿� ����ϱ�
SELECT empno,ename,sal FROM emp WHERE sal >= 2000;
6. emp ���̺��� �μ���ȣ�� 10���� ������� ��� ������ ����� ������
SELECT * FROM emp WHERE deptno=10;	
7. emp ���̺��� �Ի����� '81/02/20' �� ����� �����ȣ, 
�̸�, �Ի����� ����� ������.
SELECT empno,ename,hiredate FROM emp WHERE hiredate='81/02/20';
8. emp ���̺��� ������ 'SALESMAN' �� ����� �̸�, ����, �޿���
����� ������. ��, �޿��� ���� �������
SELECT ename,job,sal FROM emp WHERE job='SALESMAN' ORDER BY job ASC;
9. �÷� �̸� �ٲٱ�  (��Ī) rs.get
SELECT EMPNO AS  "�����ȣ",ENAME AS "����̸�" FORM EMP;
== SELECT EMPNO �����ȣ, ENAME ����̸� FORM EMP;
=> ��Ī�� �Ҷ� ������������ "" �ٿ��ߵ�
10. �޿��� 3000�̻��� ����� ��� ������ ����غ�����.
11. �μ���ȣ�� 30���� �ƴ� ����� �̸��� �μ���ȣ�� ����� ������.
- SELECT ename,deptno FROM emp WHERE deptno != 30;
12. �μ���ȣ�� 10���̰� �޿��� 3000�̻��� ������� �̸��� �޿��� ����� ������
- SELECT ename sal FROM emp WHERE deptno=10 AND sal >=3000;
13. ������ 'SALESMAN' �̰ų�(0R) 'MANAGER' �� ����� �����ȣ�� �μ���ȣ�� ����� ������.	
- SELECT empno deptno FROM emp WHERE JOB='SALESMAN' OR JOB='MANAGER';
IN �� �̿��ؼ� ��� �غ���        
- SELECT empno deptno FROM emp where job IN('SALESMAN','MANAGER');

!!  J �÷ν����ϴ� ename deptno ���
- SELECT ename,deptno FROM emp WHERE ename LIKE 'J%';
!! E ������ �ΰ� ���
- SELECT ename,sal,hiredate FROM emp WHERE ename LIKE '%E%';
!! || ������
SELECT ename || " �� ������" || job || ' �Դϴ�' FROM emp;
!! LIKE ������ ( ���ڿ� ��) �ſ�ſ� �߿���
- ��� �̸��� 'J' �� �����ϴ� ����� ����̸��� �μ���ȣ�� ����ϱ�
SELECT ename,deptno FROM emp WHERE ename LIKE 'J%';
- ����̸��� 'J' �� ���Եȴ� ����� �̸��� �μ���ȣ�� ����ϱ�
SELECT ename,deptno FROM emp WHERE ename LIKE '%J%';
- ����̸��� �ι�° ���ڰ� 'A' �� ����� �̸�,�޿�,�Ի����� ����ϱ�
SELECT ename,sal,hiredate FROM emp WHERE ename LIKE '_A%';
- ��� �̸��� 'ES' �� ������ ����� �̸�,�޿�,�Ի����� ����� ������
SELECT ename,sal,hiredate FROM emp WHERE ename LIKE '%ES';
- �Ի�⵵�� 81�� �� ������� �Ի��ϰ� �����ȣ�� ����� ������.
SELECT hiredate,empno FROM emp WHERE hiredate LIKE '81%';


//  DUAL TABLE  SELECT ���� TABLE
DESC DUAL; 
*/