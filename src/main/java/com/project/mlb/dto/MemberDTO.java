package com.project.mlb.dto;

import lombok.Getter;

@Getter
public class MemberDTO {
    private String loginId;
    private String password;
    private String name;
    private String nickname;
    private String email;
    private String phoneNumber;

    public MemberDTO(String loginId, String password, String name, String nickname, String email, String phoneNumber) {
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
