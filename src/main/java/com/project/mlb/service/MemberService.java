package com.project.mlb.service;

import com.project.mlb.exception.UserNotFoundException;
import com.project.mlb.mapper.MemberMapper;
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

    @Transactional
    public Member getMemberInfo(Long memberId) {
        Optional<Member> memberOptional = memberMapper.findByMemberId(memberId);
        if (memberOptional.isEmpty()) {
            throw new UserNotFoundException("존재하지 않는 유저입니다.");
        }
        return memberOptional.get();
    }

    /**
     * 날짜: 2022/08/22
     * 서비스: 로그인
     */
    @Transactional
    public Member signIn(String loginId) {
        Optional<Member> memberOptional = memberMapper.findByLoginId(loginId);
        if (memberOptional.isEmpty()) {
            throw new UserNotFoundException("존재하지 않는 유저입니다.");
        }
        return memberOptional.get();
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
