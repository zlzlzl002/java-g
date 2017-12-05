/*
DB
1.C:\oraclexe\app\oracle\product\10.2.0\server\RDBMS\ADMIN\scott.sql
2.desc emp

emp 테이블 (사원 테이블)
empno => 사원번호
ename => 사원 이름
job => 직책
mgr => 메니저의 사번(직속 상관의 사원번호)
hiredate  => 입사일
sal => 급여
comm => 성과급(보너스)
deptno => 부서번호

                                    
SELET                             
FROM 테이블명                 
WHERE 조건절                  
GROUP BY 칼럼명
HAVING 조건절             
ORDER BY 칼럼명 ASC|DESC 오름 내림  

실행순서
FROM => WHERE => SELECT => ORDER

1. EMP 테이블에서 사원번호, 사원이름, 직업을 출력해 보세요.
SELECT empno,ename,job FROM emp;	
2. emp 테이블에서 사원번호, 급여, 부서번호를 출력해 보세요.
단, 급여가 많은 순서대로 출력
SELECT empno,sal,deptno FROM emp ORDER BY sal DESC;
3. emp 테이블에서 사원번호, 급여, 입사일을 출력해 보세요.
단, 급여가 적은 순서대로 출력
SELECT empno,sal,hiredate FROM emp ORDER BY SAL ASC;
4. emp 테이블에서 직업,급여를 출력해보세요
단, 직업명으로 오름차순, 급여로 내림차순 정렬해 보세요. 
SELECT job,sal FROM emp ORDER BY job ASC, sal DESC;
5. 급여가 2000 이상인 사원의 사원번호, 이름, 급여 출력하기
SELECT empno,ename,sal FROM emp WHERE sal >= 2000;
6. emp 테이블에서 부서번호가 10번인 사원들의 모든 정보를 출력해 보세요
SELECT * FROM emp WHERE deptno=10;	
7. emp 테이블에서 입사일이 '81/02/20' 인 사원의 사원번호, 
이름, 입사일을 출력해 보세요.
SELECT empno,ename,hiredate FROM emp WHERE hiredate='81/02/20';
8. emp 테이블에서 직업이 'SALESMAN' 인 사원의 이름, 직업, 급여를
출력해 보세요. 단, 급여가 높은 순서대로
SELECT ename,job,sal FROM emp WHERE job='SALESMAN' ORDER BY ob ASC;
9. 컬럼 이름 바꾸기  (별칭)
SELECT EMPNO AS  "사원번호",ENAME AS "사원이름" FORM EMP;
== SELECT EMPNO 사원번호, ENAME 사원이름 FORM EMP;
=> 별칭을 할때 공백이있으면 "" 붙여야됨
*/