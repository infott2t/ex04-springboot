# ex04-springboot
스프링부트 jpa, 타임리프 적용 네비게이션 게시판입니다.

sql, 



--데이터베이스 생성 EXAMPLE0
CREATE DATABASE EXAMPLE0 DEFAULT CHARACTER SET utf8;

--유저 생성 admin0
CREATE USER 'admin0'@'localhost' IDENTIFIED WITH mysql_native_password BY '1234';

--DB권한 부여하기.
GRANT ALL PRIVILEGES ON EXAMPLE0.* TO 'admin0'@'localhost';

USE EXAMPLE0;
