package com.project.mlb.controller;

import com.project.mlb.dto.member.MemberInfoDTO;
import com.project.mlb.dto.member.sign.MemberSignInDTO;
import com.project.mlb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    /**
     * 날짜: 2022/08/14
     * 로그인 폼
     */
    @GetMapping("/sign-in")
    public String signInForm(Model model) {
        MemberSignInDTO memberSignIn = MemberSignInDTO.
                builder().
                loginId("id").
                password("password").
                build();
        model.addAttribute("signIn", memberSignIn);
        return "mlb/sign/form/signInForm";
    }


    /**
     * 날짜: 2022/08/14
     * 회원가입 폼
     */
    @GetMapping("/sign-up")
    public String signUpForm() {

        return "mlb/sign/form/signUpForm";
    }

    /**
     * 날짜: 2022/08/14
     * 회원가입 등록
     */
//    @PostMapping("/sign-up")
//    public String signUp(@ModelAttribute) {
//
//    }

    /**
     * 날짜: 2022/08/12
     * 임시 테스트용 컨트롤러: 삭제 예정
     */
    @GetMapping("/{memberId}/info")
    public String memberInfo(@PathVariable long memberId, Model model) {

        MemberInfoDTO memberInfoDTO = memberService.getMemberInfo(memberId);
        model.addAttribute("memberInfoDTO", memberInfoDTO);
        return "mlb/members/memberInfo";
    }
}


