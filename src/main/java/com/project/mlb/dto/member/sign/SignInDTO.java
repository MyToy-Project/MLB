package com.project.mlb.dto.member.sign;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberSignInDTO {
    private String loginId;
    private String password;
}
