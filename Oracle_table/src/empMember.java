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
SELECT ename,job,sal FROM emp WHERE job='SALESMAN' ORDER BY ob ASC;
9. �÷� �̸� �ٲٱ�  (��Ī)
SELECT EMPNO AS  "�����ȣ",ENAME AS "����̸�" FORM EMP;
== SELECT EMPNO �����ȣ, ENAME ����̸� FORM EMP;
=> ��Ī�� �Ҷ� ������������ "" �ٿ��ߵ�
*/