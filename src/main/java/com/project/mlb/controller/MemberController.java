package com.project.mlb.controller;

import com.project.mlb.dto.member.sign.SignInDTO;
import com.project.mlb.dto.member.sign.SignUpDTO;
import com.project.mlb.service.MemberService;
import com.project.mlb.validator.MemberValidator;
import com.project.mlb.vo.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.Session;

@Slf4j
@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final MemberValidator memberValidator;


    /**
     * 날짜: 2022/08/14
     * 로그인 폼
     */
    @GetMapping("/sign-in")
    public String signInForm(Model model) {
        SignInDTO memberSignIn = SignInDTO.builder().build();
        model.addAttribute("signIn", memberSignIn);
        return "mlb/sign/form/signInForm";
    }

    /**
     * 날짜: 2022/08/22
     * 로그인 폼
     */
//    @PostMapping("/sign-in")
//    public String signIn(@ModelAttribute SignInDTO signInDTO, Session session) {
//        try {
//            memberValidator.checkStringNull("로그인 아이디", signInDTO.getLoginId());
//            memberValidator.checkStringNull("로그인 패스워드", signInDTO.getPassword());
//        } catch (RuntimeException e) {
//            log.info(e.getMessage());
//            return "mlb/sign/form/signInForm";
//        }
//        Member member = memberService.signIn(signInDTO.getLoginId());
//
//    }

    /**
     * 날짜: 2022/08/18
     * 회원가입 폼
     */
    @GetMapping("/sign-up")
    public String signUpForm(Model model) {
        SignUpDTO signUpDTO = SignUpDTO.builder().build();
        model.addAttribute("signUpDTO", signUpDTO);
        return "mlb/sign/form/signUpForm";
    }

    /**
     * 날짜: 2022/08/18
     * 회원가입 등록
     */
    @PostMapping("/sign-up")
    public String signUp(@ModelAttribute SignUpDTO signUpDTO) {
        Member member = memberValidator.checkPassword(signUpDTO);
        memberService.signUp(member);

        return "redirect:/";
    }

    /**
     * 날짜: 2022/08/12
     * 임시 테스트용 컨트롤러: 삭제 예정
     */
    @GetMapping("/{memberId}/info")
    public String memberInfo(@PathVariable long memberId, Model model) {

        Member member = memberService.getMemberInfo(memberId);
        model.addAttribute("memberInfoDTO", member);
        return "mlb/members/memberInfo";
    }
}


