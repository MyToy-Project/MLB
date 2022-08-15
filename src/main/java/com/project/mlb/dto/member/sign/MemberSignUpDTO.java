package com.project.mlb.dto.member.sign;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberSignUpDTO {
    private String name;
    private String loginId;
    private String password;
    private String passwordCheck;
    private String nickname;
    private String email;
    private String phoneNumber;
}
