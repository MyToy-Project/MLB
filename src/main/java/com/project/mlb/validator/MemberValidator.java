package com.project.mlb.validator;

import com.project.mlb.dto.member.sign.SignUpDTO;
import com.project.mlb.mapper.MemberMapper;
import com.project.mlb.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MemberValidator {

    private final MemberMapper memberMapper;

    /**
     * 날짜: 2022/08/18
     * 회원가입 검증: 비밀번호 체크
     * TODO: 회원가입 검증 예외 처리 추가
     */
    public Member checkPassword(SignUpDTO signUpDTO) {
        if (!signUpDTO.getPassword().equals(signUpDTO.getPasswordCheck())) {
            System.out.println("추후 예외 처리 추가: 패스워드가 다릅니다.");
            return null;
        }
        return Member.builder()
                .loginId(signUpDTO.getLoginId())
                .password(signUpDTO.getPassword())
                .name(signUpDTO.getName())
                .nickname(signUpDTO.getNickname())
                .email(signUpDTO.getEmail())
                .phoneNumber(signUpDTO.getPhoneNumber())
                .build();
    }

    public void checkStringNull(String column, String value) {
        if (value == null) {
            throw new IllegalArgumentException(column + " 을 입력해야합니다.");
        }
    }
}
