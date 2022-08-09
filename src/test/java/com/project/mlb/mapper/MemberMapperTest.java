package com.project.mlb.mapper;

import com.project.mlb.dto.member.MemberInfoDTO;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

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


}
