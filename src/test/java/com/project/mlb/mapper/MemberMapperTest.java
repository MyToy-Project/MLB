package com.project.mlb.mapper;

import com.project.mlb.dto.login.MemberInfoResponseDTO;
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
        MemberInfoResponseDTO failMemberInfoDTO = new MemberInfoResponseDTO("fail", "fail", "fail", "fail", "fail", "fail");

        // when
        Optional<MemberInfoResponseDTO> memberInfoResponseDTO = memberMapper.findByUserId(ADMIN_ID);
        MemberInfoResponseDTO responseDTO = memberInfoResponseDTO.orElse(failMemberInfoDTO);
        System.out.println(responseDTO);

        // then
        assertThat(responseDTO.getLoginId()).isNotEqualTo("fail");
        assertThat(responseDTO.getLoginId()).isEqualTo("admin");
    }


}
