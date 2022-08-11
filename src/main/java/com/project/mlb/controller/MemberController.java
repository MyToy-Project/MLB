package com.project.mlb.controller;

import com.project.mlb.dto.member.MemberInfoDTO;
import com.project.mlb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


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


