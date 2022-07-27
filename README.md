# MLB
My Little Blog
# [ToyPrj] 나의 작은 블로그

Week: Far Away
진행상태: 현재 진행(예정)중인 작업

### 나의 작은 블로그(나작블)

- 진행 순서
    - 사용 기술 분석 `2022/07/21 ~ 2022/07/22`
        
        [[토이] 나의 작은 블로그 프로젝트 계획](https://www.notion.so/2bf997970a89499eb8f98a26c9e4fb55) `07/21`
        
        [[토이] 프로젝트 개요 정리하기](https://www.notion.so/2cf661a9ff3e4e16ae21132f90a2ba91) `07/22`
        
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
    - 요구 사항 분석 및 트랜잭션 분석`2022/07/24`
        
        [[MLB] 요구 사항 분석, 트랜잭션 분석](https://www.notion.so/MLB-1daf2a960b074ce494d53a1ba5324410) 
        
    - 개념적 설계(개념적 모델링(ERD), 트랜잭션 모델링(유형별 트랜잭션 설계)) `2022/07/26`
        
        [[MLB] 개념적 설계(ERD)](https://www.notion.so/MLB-ERD-764e69d67974466eab87a48fb2a769ca) 
        
        [[MLB] 개념적 설계(트랜잭션 모델링)](https://www.notion.so/MLB-5dde233abf04458eb8cc428192969d08) 
        
    - 논리적 설계(릴레이션 스키마 변경), 물리적 설계(내부 스키마) `2022/07/27`
        
        [[MLB] 논리적 설계(릴레이션 스키마, 무결성 제약조건 정의), 물리적 설계(내부 스키마)](https://www.notion.so/MLB-914e6d0f29cb4b15a4d6fd9510892acd) 
        
    - 화면 정의 `2022/07/23`
        
         [[토이] 프로젝트 화면 설계](https://www.notion.so/7053e25d04fa49cfb398fe22a4e1f2e9) `07/23`
        
        요구 사항 분석의 수월함과 개략적인 확인을 위해 화면을 우선적으로 정의함
        
        ![로그인전 메인화면.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25EB%25A1%259C%25EA%25B7%25B8%25EC%259D%25B8%25EC%25A0%2584_%25EB%25A9%2594%25EC%259D%25B8%25ED%2599%2594%25EB%25A9%25B4.png)
        
        로그인전 메인 화면
        
        ![로그인 화면.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25EB%25A1%259C%25EA%25B7%25B8%25EC%259D%25B8_%25ED%2599%2594%25EB%25A9%25B4.png)
        
        로그인 화면
        
        ![회원 가입 폼.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25ED%259A%258C%25EC%259B%2590_%25EA%25B0%2580%25EC%259E%2585_%25ED%258F%25BC.png)
        
        회원가입 화면
        
        ![로그인후 메인 화면.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25EB%25A1%259C%25EA%25B7%25B8%25EC%259D%25B8%25ED%259B%2584_%25EB%25A9%2594%25EC%259D%25B8_%25ED%2599%2594%25EB%25A9%25B4.png)
        
        로그인 후 메인
        
        ![글쓰기 화면.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25EA%25B8%2580%25EC%2593%25B0%25EA%25B8%25B0_%25ED%2599%2594%25EB%25A9%25B4.png)
        
        글쓰기 화면
        
        ![내가 쓴 글 조회.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25EB%2582%25B4%25EA%25B0%2580_%25EC%2593%25B4_%25EA%25B8%2580_%25EC%25A1%25B0%25ED%259A%258C.png)
        
        내가 쓴 글 조회
        
        ![글 수정 화면.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25EA%25B8%2580_%25EC%2588%2598%25EC%25A0%2595_%25ED%2599%2594%25EB%25A9%25B4.png)
        
        글 수정 화면
        
        ![전체 글 조회.png](%5BToyPrj%5D%20%E1%84%82%E1%85%A1%E1%84%8B%E1%85%B4%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%8B%E1%85%B3%E1%86%AB%20%E1%84%87%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%20c3189f7639be4feb982f0aabf2a79d67/%25EC%25A0%2584%25EC%25B2%25B4_%25EA%25B8%2580_%25EC%25A1%25B0%25ED%259A%258C.png)
        
        전체 글 조회
        
    1. DB 개설
    2. 점검
    3. 프로젝트 시작
- 아래 저장소를 참고
    - [https://github.com/E-TF/Momo/issues](https://github.com/E-TF/Momo/issues)
