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
// JOIN
14. emp, dept ���̺��� �̿��ؼ� ����� �̸�, �μ���ȣ , �μ����� ����ϱ� 
15. emp, dept ���̺��� �̿��ؼ� ������ ���� SELECT �� ������
SWITH �� RESEARCH �μ����� �ٹ� �մϴ�.
ALLEN ��  SALES �μ����� �ٹ� �մϴ�.
WARD �� SALES �μ����� �ٹ��մϴ�.
SELECT ename || '��' || dname  || '�μ����� �ٹ� �մϴ�.' info FROM emp,dept WHERE 

emp.deptno=dept.deptno; 


!! NVL �Լ� NULL �ΰ��� 0���� ����
- SELECT NVL(Į����, 0) FROM ���̺��;
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
!! TO_CHAR ���ڷιٲٴ�                         | �� SYSDATE    HIREDATE
- ����� DATE 
SELECT TO_CHAR (SYSDATE, 'YYY"�� "MM"�� "DD"��"') FROM DUAL;
// 24�� ǥ��
SELECT TO_CHAR (SYSDATE, 'YYY"�� "MM"�� "DD"��" HH24:MI:SS') FROM DUAL;
// AM �߰� Į���� REGDATE�� ���ֱ�
SELECT TO_CHAR (SYSDATE, 'YYY"�� "MM"�� "DD"��" AM HH24:MI:SS') REGDATE FROM DUAL;
!! ROUND �ݿø�
�μ��� ��� �޿��� ���غ����� (�ݿø��ؼ� �Ҽ� ù° �ڸ� ������)
SELECT deptno,ROUND(AVG(sal),1) FROM emp GROUP BY deptno;
!! HAVING �׷� �߸� 
SELECT deptno,ROUND(AVG(sal)) FROM emp WHERE sal >=1000 GROUP BY deptno HAVING 

AVG(sal) >= 2000;
//  ed ������ �ֱ� �Է� ����
SELECT * FROM deft;
SELECT * FROM salgrade;
/ enter ������ ����
!! SELF ���� �ϴ� ���
SELECT e1.ename || '�� �Ŵ����� ' || e2.ename || '�Դϴ�' info FROM emp e1, emp e2 WHERE 

E1.MGR=E2.EMPNO
!! [ ANSI ���� ]
- �μ����� 'ACCOUNTING' �� ����� �̸�, �Ի���, �μ���ȣ, �μ��� �� ����غ�����
SELECT ename, hiredate, e.deptno, dname 
FROM emp e, dept d
WHERE e.deptno = d.deptno 
AND dname = 'ACCOUNTING';

- ���̺� ��Ī ���̱�

SELECT ename, hiredate, e.deptno, dname
FROM emp e
INNER JOIN dept d ON e.deptno = d.deptno
WHERE dname = 'ACCOUNTING'

- ANSI JOIN ( ���� ������ Į������ ���ٸ� )

SELECT ename, hiredate, deptno, dname
FROM emp
INNER JOIN dept USING(deptno)
WHERE dname = 'ACCOUNTING'



//  DUAL TABLE  SELECT ���� TABLE
DESC DUAL;

<��ƼĿ �޸���>
SYSDATE �����ϴ� ������ ��¥

������ ���̺� �����
CREATE TABLE message( num number PRIMARY KEY, msg VARCHAR2(30), regdate DATE);

CREATE SEQUENCE message_seq;

plug �ϱ�
Eclipse 
http://quantum.sourceforge.net/ ����
How to install ������ �ּ� http://quantum.sourceforge.net/update-site".
Help NEWistal  http://quantum.sourceforge.net/update-site ���ʹ����� select �ϰ� next
I accept the üũ
*/