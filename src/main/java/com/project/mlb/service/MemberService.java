package com.project.mlb.service;

import com.project.mlb.dto.member.MemberInfoDTO;
import com.project.mlb.dto.member.sign.SignUpDTO;
import com.project.mlb.exception.UserNotFountException;
import com.project.mlb.mapper.MemberMapper;
import com.project.mlb.validator.MemberValidator;
import com.project.mlb.vo.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberMapper memberMapper;
    private final MemberValidator memberValidator;

    @Transactional(readOnly = true)
    public MemberInfoDTO getMemberInfo(Long userId) {
        Optional<MemberInfoDTO> optionalMember = memberMapper.findByMemberId(userId);
        if (optionalMember.isEmpty()) {
            throw new UserNotFountException("존재하지 않는 유저입니다.");
        }
        return optionalMember.get();
    }

    /**
     * 날짜: 2022/08/18
     * 서비스: 회원가입
     */
    @Transactional
    public Long signUp(Member member) {
        memberMapper.signUp(member);
        return member.getId();
    }
}
