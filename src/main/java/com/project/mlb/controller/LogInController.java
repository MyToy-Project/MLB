package com.project.mlb.controller;


import com.project.mlb.dto.LogInDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/form")
public class LogInController {

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("logInDTO", new LogInDTO());
        return "login/signInForm";
    }

    @ResponseBody
    @PostMapping("/login")
    public LogInDTO login(@ModelAttribute LogInDTO logInDTO) {
        log.info("LoginDTO={}", logInDTO.toString());
        return logInDTO;
    }
}
