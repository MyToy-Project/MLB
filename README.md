# MLB
### My Little Blog

진행 순서
    
<details><summary>사용 기술 분석 [2022/07/21 ~ 2022/07/22] </summary>

 * [[토이] 나의 작은 블로그 프로젝트 계획](https://www.notion.so/2bf997970a89499eb8f98a26c9e4fb55) `07/21`

 * [[토이] 프로젝트 개요 정리하기](https://www.notion.so/2cf661a9ff3e4e16ae21132f90a2ba91) `07/22`
    
  - Spring Boot Starter
      - Project : Gradle Project
      - Spring Boot Version : 2.6.8
      - Group : com.project
      - Artifact: mlb
      - Packaging : Jar
      - Java Version : 11
      - Dependencies
          - Spring Boot (2.7.2ver)
          - Lombok
          - Thymeleaf
          - MySQL Driver
          - MyBatis Framework
  - 사용 기술
      - MySQL 8.0
      - MyBatis
      - Java11
      - Spring Framwork
      - Gradle
</details>

<details><summary>요구 사항 분석 및 트랜잭션 분석 [2022/07/24]</summary>

* [[MLB] 요구 사항 분석, 트랜잭션 분석](https://www.notion.so/MLB-1daf2a960b074ce494d53a1ba5324410)

</details>
  
<details><summary>개념적 설계(개념적 모델링(ERD), 트랜잭션 모델링(유형별 트랜잭션 설계)) [2022/07/26]</summary>

* [[MLB] 개념적 설계(ERD)](https://www.notion.so/MLB-ERD-764e69d67974466eab87a48fb2a769ca) 
  
*  [[MLB] 개념적 설계(트랜잭션 모델링)](https://www.notion.so/MLB-5dde233abf04458eb8cc428192969d08) 

</details>
  
<details><summary>논리적 설계(릴레이션 스키마 변경), 물리적 설계(내부 스키마) [2022/07/27]</summary>

* [[MLB] 논리적 설계(릴레이션 스키마, 무결성 제약조건 정의), 물리적 설계(내부 스키마)](https://www.notion.so/MLB-914e6d0f29cb4b15a4d6fd9510892acd)

</details>


<details><summary>화면 정의 [2022/07/23]</summary>

* [[토이] 프로젝트 화면 설계](https://www.notion.so/7053e25d04fa49cfb398fe22a4e1f2e9) `07/23`

요구 사항 분석의 수월함과 개략적인 확인을 위해 화면을 우선적으로 정의함
      
![로그인전 메인화면](https://user-images.githubusercontent.com/66772624/181343960-65622fda-d6e5-4d44-898c-12ae5fe21bb5.png)
    
로그인전 메인 화면

![로그인 화면](https://user-images.githubusercontent.com/66772624/181343995-50553c5e-e5d2-4397-b5ed-cc8b54a7e96f.png)
    
로그인 화면

![회원 가입 폼](https://user-images.githubusercontent.com/66772624/181344020-0a2b81d8-9f1d-48e8-8439-66a830556e82.png)
    
회원가입 화면


![로그인후 메인 화면](https://user-images.githubusercontent.com/66772624/181344047-7af9a024-42c5-4d69-9380-8325f1cf2c1a.png)
    
로그인 후 메인


![글쓰기 화면](https://user-images.githubusercontent.com/66772624/181344067-16328db5-8098-41bc-84be-21cc50dfc968.png)
    
글쓰기 화면


![내가 쓴 글 조회](https://user-images.githubusercontent.com/66772624/181344098-64138682-3abd-4f84-9614-861e1b052dc7.png)
    
내가 쓴 글 조회


![글 수정 화면](https://user-images.githubusercontent.com/66772624/181344108-591e3325-e93c-40b0-8762-ee925e6d08df.png)
    
글 수정 화면


![전체 글 조회](https://user-images.githubusercontent.com/66772624/181344130-88a6a03a-56cf-427e-b04d-3d951e9a4082.png)
    
전체 글 조회

</details>

<details><summary>DB 개설 [2022/07/28]</summary>

```sql
create table MEMBER (
    `id` BIGINT not null AUTO_INCREMENT,
    `name` varchar(45),
    `nickname` varchar(60),
    `login_id` varchar(10),
    `password` varchar(255),
    `email` varchar(255),
    `phone_number` varchar(20),
    unique(login_id),
    primary key(id)
);

create table ARTICLE (
    `id` BIGINT not null AUTO_INCREMENT,
    `member_id` BIGINT,
    `title` varchar(45),
    `content` blob,
    `views` bigint default 0,
    `date` timestamp default CURRENT_TIMESTAMP(),
    `categories` varchar(45),
    check (views >= 0),
    foreign key(member_id) references MEMBER(id),
    primary key(id)
);

create table RECOMMEND(
    id bigint not null auto_increment,
    member_id bigint,
    article_id bigint,
    foreign key(member_id) references MEMBER(id),
    foreign key(article_id) references ARTICLE(id),
    primary key(id)
);

create table COMMENT(
    id bigint not null auto_increment,
    member_id bigint,
    article_id bigint,
    content varchar(255),
    `date` timestamp default current_timestamp(),
    foreign key(member_id) references MEMBER(id),
    foreign key(article_id) references ARTICLE(id),
    primary key(id)
);
```

</details>

<details><summary>점검 [2022/08/01]</summary>

* MyBatis 쿼리 조회 및 화면에 데이터 출력 연동 완료
  * [[MLB] DB 개설 및 MyBatis 연동 후 전체 점검](https://balanced-soccer-9b0.notion.site/MLB-DB-MyBatis-70eee1db668f4a16b1bf370f37eaed90)
  * [[MLB] MyBatis MapperLocations오류 문제 찾기](https://balanced-soccer-9b0.notion.site/MLB-MyBatis-MapperLocations-2e56c736f4ca436b8ed377952f1b3bed)
</details>

- 아래 저장소를 참고
  - [https://github.com/E-TF/Momo/issues](https://github.com/E-TF/Momo/issues)

### 프로젝트 시작
<details><summary>진행과정[2022/07/28~]</summary>

* [[MLB] DB 개설 및 MyBatis 연동 후 전체 점검](https://balanced-soccer-9b0.notion.site/MLB-DB-MyBatis-70eee1db668f4a16b1bf370f37eaed90)
* [[MLB] MyBatis MapperLocations오류 문제 찾기](https://balanced-soccer-9b0.notion.site/MLB-MyBatis-MapperLocations-2e56c736f4ca436b8ed377952f1b3bed)
* [[MLB] 화면 만들기(1)](https://balanced-soccer-9b0.notion.site/MLB-1-4870eac89b724616a00633292242550b)
* [[MLB] 화면 만들기(2)](https://balanced-soccer-9b0.notion.site/MLB-2-58da1350aaa648be8fe3ba2678e56e48)
* [[MLB] 화면 만들기(3)](https://balanced-soccer-9b0.notion.site/MLB-3-673a4233d93f4bfe9decfc4da5197870)
* [[Git] Git Flow 익히기](https://balanced-soccer-9b0.notion.site/Git-Git-Flow-2377ab07dee74909a70a9eb23a0d6389) : 프로젝트 시작전 효율적인 프로젝트 관리를 위해
</details>

