/*
oracle 데이터 베이스설치(oracle xe)  입력 수정 삭제 목록불러오기(select) 
주로저장: number string date   |  file 은 잘사용안함 
비밀번호 oracle
cmd 
1. sqlplus
2. 사용자명: system
3. 암호: oracle
4. CREATE USER scott(계정) IDENTIFIED BY tiger(비밀번호); 사용자 생성
5. GRANT connet,resource TO scott;   접속권한
6. conn scott/tiger     system 계정에서 scott/tiger로 
7. Table 만드는법         예약어는 대문자(oracle 에서 특별히 해석하는 용어)
CREATE TABLE  member(num NUMBER, name VARCHAR2(10), addr VARCHAR2(20));  ()안 3개 정의 칼럼은 3개다
8. Table 확인 하는방법 : DESC talbe name;           ex) DESC member 
8. data 저장하는법 
INSERT INTO member ( num, name, addr ) VALUES(1, '김구라', '노량진');  <= row 
9. table 저장된 목록보기  SELECT 칼럼명 FROM 테이블명
SELECT num,name,addr FROM member;
10. table row 지우는 방법      ex) DELETE FROM member WHERE num=2;  번호가 2번인 row 삭제
- num 지우는법 DELETE FROM table명 WHERE num=2;  oracle 에서는 = 는 비교연산자이다.
- name 지우는법 DELETE FROM table명 WHERE name='';  ex) name='김구라';
11. 칼럼 안에있는 정보 수정하기    EX) UPDATE member SET name='문용범' WHERE num=1;
UPDATE member SET name='' WHERE num=1;      
12. 테이블 삭제 DROP TABLE 테이블명;  
13. table 만들때 아이디값 주기  	EX)  num=1;  값이 2개 존재x
CREATE TABLE member(num NUMBER PRIMARY KEY, name VARCHAR2(10), addr VARCHAR2(20);


끄고 다시키면
sqlplus system/oracle  | system 계정으로
sqlplus scott/tiger      | scott 계정으로

client WebBrowser = > java application = > DB
                  get 방식

[Table] 
member 
[ num number | name String | add string ]
[          row 1                                 ]  회원정보를 저장할때마다 row 가생긴다.
[          row 2                                 ]                               ]
 */
