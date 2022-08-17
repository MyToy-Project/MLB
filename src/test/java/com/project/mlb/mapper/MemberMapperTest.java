package com.project.mlb.mapper;

import com.project.mlb.dto.member.MemberInfoDTO;
import com.project.mlb.vo.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@Transactional
@SpringBootTest
@AutoConfigureMybatis
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;
    private final Long ADMIN_ID = 3L;

    @Test
    void findByUserId() {
        // given
        MemberInfoDTO failMemberInfoDTO = MemberInfoDTO.builder()
                .loginId("fail")
                .password("fail")
                .name("fail")
                .nickname("fail")
                .email("fail")
                .phoneNumber("fail")
                .build();

        // when
        Optional<MemberInfoDTO> memberInfoResponseDTO = memberMapper.findByMemberId(ADMIN_ID);
        MemberInfoDTO responseDTO = memberInfoResponseDTO.orElse(failMemberInfoDTO);
        System.out.println(responseDTO);

        // then
        assertThat(responseDTO.getLoginId()).isNotEqualTo("fail");
        assertThat(responseDTO.getLoginId()).isEqualTo("admin");
    }


    /**
     * 날짜: 2022/08/18
     * 테스트: 회원가입 매퍼 테스트
     */
    @Test
    @DisplayName("멤버 회원가입 Mapper 테스트")
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
        memberMapper.signUp(member);
        Optional<MemberInfoDTO> findMember = memberMapper.findByMemberId(member.getId());
        MemberInfoDTO memberInfoDTO = findMember.get();

        // then
        assertThat(memberInfoDTO.getEmail()).isEqualTo(member.getEmail());
    }


}
