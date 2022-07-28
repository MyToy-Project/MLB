package com.project.mlb.dto;

import lombok.Getter;

@Getter
public class MemberDTO {
    private String login_id;
    private String password;
    private String name;
    private String nickname;
    private String email;
    private String phone_number;

    public MemberDTO(String login_id, String password, String name, String nickname, String email, String phone_number) {
        this.login_id = login_id;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phone_number = phone_number;
    }
}
