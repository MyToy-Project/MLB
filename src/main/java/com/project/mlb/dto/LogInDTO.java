package com.project.mlb.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LogInDTO {
    private String logInId;
    private String password;

    public LogInDTO(String loginId, String password) {
        this.logInId = loginId;
        this.password = password;
    }
}
