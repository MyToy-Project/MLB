package com.project.mlb.controller;

import com.project.mlb.dao.MemberDAO;
import com.project.mlb.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberDAO memberDAO;

    @GetMapping
    public List<MemberDTO> memberDTOList() {
        return memberDAO.getMemberData();
    }
}
