package com.project.mlb.service;

import com.project.mlb.dto.member.MemberInfoDTO;
import com.project.mlb.dto.member.sign.SignUpDTO;
import com.project.mlb.vo.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMybatis
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class memberServicetest {

    @Autowired
    private MemberService memberService;
    private final Long ADMIN_ID = 3L;

    @Test
    @DisplayName("멤버 정상 조회 테스트")
    void getMemberInfoSuccess() {
        // given, when
        MemberInfoDTO memberInfo = memberService.getMemberInfo(ADMIN_ID);

        // then
        assertThat(memberInfo.getLoginId()).isEqualTo("admin");
    }

    @Test
    @DisplayName("멤버 조회 실패시 예외 테스트")
    void getMemberInfoFail() {
        // given
        final Long FAIL_ID = -1L;
        final String failMessage = "존재하지 않는 유저입니다.";

        // when, then
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            memberService.getMemberInfo(FAIL_ID);
        });
        assertThat(exception.getMessage()).isEqualTo(failMessage);
    }


    /**
     * 날짜: 2022/08/18
     * 테스트: 회원가입 서비스 테스트
     */
    @Test
    @Transactional
    @DisplayName("멤버 회원가입 성공 테스트")
    void signUp() {
        // given
        Member member = Member.builder()
                .name("hoseok")
                .loginId("aaa")
                .nickname("HiiW")
                .password("aaa")
                .email("aaa@naver.com")
                .phoneNumber("010-0000-0000")
                .build();

        // when
        Long memberId = memberService.signUp(member);
        MemberInfoDTO memberInfo = memberService.getMemberInfo(memberId);

        // then
        assertThat(member.getLoginId()).isEqualTo(memberInfo.getLoginId());

    }
}
