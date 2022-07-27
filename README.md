# MLB
### My Little Blog

진행 순서
    
<details><summary>사용 기술 분석 [2022/07/21 ~ 2022/07/22] </summary>

 * [[토이] 나의 작은 블로그 프로젝트 계획](https://www.notion.so/2bf997970a89499eb8f98a26c9e4fb55) `07/21`

 * [[토이] 프로젝트 개요 정리하기](https://www.notion.so/2cf661a9ff3e4e16ae21132f90a2ba91) `07/22`
    
  - Spring Boot Starter
      - Project : Gradle Project
      - Spring Boot Version : 2.7.2
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
      
1. DB 개설
2. 점검
3. 프로젝트 시작
- 아래 저장소를 참고
  - [https://github.com/E-TF/Momo/issues](https://github.com/E-TF/Momo/issues)
