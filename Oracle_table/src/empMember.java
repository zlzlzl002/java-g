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
ORACLE 비교연산자로 NULL 비교할수 없다   IS NULL | IS NOT NULL 사용해서 비교 할수 있다.
EX) SELECT ENAME,JOB FROM EMP WHERE COMM IS NULL;
SELECT ENAME,JOB FROM EMP WHERE COMM IS NOT NULL;

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
SELECT ename,job,sal FROM emp WHERE job='SALESMAN' ORDER BY job ASC;
9. 컬럼 이름 바꾸기  (별칭) rs.get
SELECT EMPNO AS  "사원번호",ENAME AS "사원이름" FORM EMP;
== SELECT EMPNO 사원번호, ENAME 사원이름 FORM EMP;
=> 별칭을 할때 공백이있으면 "" 붙여야됨
10. 급여가 3000이상인 사원의 모든 정보를 출력해보세요.
11. 부서번호가 30번이 아닌 사원의 이름과 부서번호를 출력해 보세요.
- SELECT ename,deptno FROM emp WHERE deptno != 30;
12. 부서번호가 10번이고 급여가 3000이상인 사원들의 이름과 급여를 출력해 보세요
- SELECT ename sal FROM emp WHERE deptno=10 AND sal >=3000;
13. 직업이 'SALESMAN' 이거나(0R) 'MANAGER' 인 사원의 사원번호와 부서번호를 출력해 보세요.	
- SELECT empno deptno FROM emp WHERE JOB='SALESMAN' OR JOB='MANAGER';
IN 을 이용해서 출력 해보기        
- SELECT empno deptno FROM emp where job IN('SALESMAN','MANAGER');
// JOIN
14. emp, dept 테이블을 이용해서 사원의 이름, 부서번호 , 부서명을 출력하기 
15. emp, dept 테이블을 이용해서 다음과 같이 SELECT 해 보세요
SWITH 는 RESEARCH 부서에서 근무 합니다.
ALLEN 는  SALES 부서에서 근무 합니다.
WARD 는 SALES 부서에서 근무합니다.
SELECT ename || '는' || dname  || '부서에서 근무 합니다.' info FROM emp,dept WHERE 

emp.deptno=dept.deptno; 


!! NVL 함수 NULL 인값을 0으로 해줌
- SELECT NVL(칼럼명, 0) FROM 테이블명;
!!  J 시로시작하는 ename deptno 출력
- SELECT ename,deptno FROM emp WHERE ename LIKE 'J%';
!! E 가포함 인것 출력
- SELECT ename,sal,hiredate FROM emp WHERE ename LIKE '%E%';
!! || 연산자
SELECT ename || " 의 직업은" || job || ' 입니다' FROM emp;
!! LIKE 연산자 ( 문자열 비교) 매우매우 중요함
- 사원 이름이 'J' 로 시작하는 사원의 사원이름과 부서번호를 출력하기
SELECT ename,deptno FROM emp WHERE ename LIKE 'J%';
- 사원이름에 'J' 가 포함된는 사원의 이름과 부서번호를 출력하기
SELECT ename,deptno FROM emp WHERE ename LIKE '%J%';
- 사원이름의 두번째 글자가 'A' 인 사원의 이름,급여,입사일을 출력하기
SELECT ename,sal,hiredate FROM emp WHERE ename LIKE '_A%';
- 사원 이름이 'ES' 로 끝나는 사원의 이름,급여,입사일을 출력해 보세요
SELECT ename,sal,hiredate FROM emp WHERE ename LIKE '%ES';
- 입사년도가 81년 인 사원들의 입사일과 사원번호를 출력해 보세요.
SELECT hiredate,empno FROM emp WHERE hiredate LIKE '81%';
!! TO_CHAR 문자로바꾸다                         | 날 SYSDATE    HIREDATE
- 년월일 DATE 
SELECT TO_CHAR (SYSDATE, 'YYY"년 "MM"월 "DD"일"') FROM DUAL;
// 24시 표시
SELECT TO_CHAR (SYSDATE, 'YYY"년 "MM"월 "DD"일" HH24:MI:SS') FROM DUAL;
// AM 추가 칼럼명 REGDATE로 해주기
SELECT TO_CHAR (SYSDATE, 'YYY"년 "MM"월 "DD"일" AM HH24:MI:SS') REGDATE FROM DUAL;
!! ROUND 반올림
부서별 평균 급여를 구해보세요 (반올림해서 소수 첫째 자리 까지만)
SELECT deptno,ROUND(AVG(sal),1) FROM emp GROUP BY deptno;
!! HAVING 그룹 추림 
SELECT deptno,ROUND(AVG(sal)) FROM emp WHERE sal >=1000 GROUP BY deptno HAVING 

AVG(sal) >= 2000;
//  ed 누르면 최근 입력 수정
SELECT * FROM deft;
SELECT * FROM salgrade;
/ enter 누르면 실행
!! SELF 조인 하는 방법
SELECT e1.ename || '의 매니져는 ' || e2.ename || '입니다' info FROM emp e1, emp e2 WHERE 

E1.MGR=E2.EMPNO
!! [ ANSI 조인 ]
- 부서명이 'ACCOUNTING' 인 사원의 이름, 입사일, 부서번호, 부서명 을 출력해보세요
SELECT ename, hiredate, e.deptno, dname 
FROM emp e, dept d
WHERE e.deptno = d.deptno 
AND dname = 'ACCOUNTING';

- 테이블에 별칭 붙이기

SELECT ename, hiredate, e.deptno, dname
FROM emp e
INNER JOIN dept d ON e.deptno = d.deptno
WHERE dname = 'ACCOUNTING'

- ANSI JOIN ( 조인 조건의 칼럼명이 같다면 )

SELECT ename, hiredate, deptno, dname
FROM emp
INNER JOIN dept USING(deptno)
WHERE dname = 'ACCOUNTING'



//  DUAL TABLE  SELECT 범위 TABLE
DESC DUAL;

<스티커 메모장>
SYSDATE 시행하는 시점에 날짜

연습용 테이블 만들기
CREATE TABLE message( num number PRIMARY KEY, msg VARCHAR2(30), regdate DATE);

CREATE SEQUENCE message_seq;

plug 하기
Eclipse 
http://quantum.sourceforge.net/ 들어가기
How to install 누르면 주소 http://quantum.sourceforge.net/update-site".
Help NEWistal  http://quantum.sourceforge.net/update-site 엔터누르고 select 하고 next
I accept the 체크
*/