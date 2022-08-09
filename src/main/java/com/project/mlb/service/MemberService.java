package com.project.mlb.service;

import com.project.mlb.dto.member.MemberInfoDTO;
import com.project.mlb.exception.UserNotFountException;
import com.project.mlb.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberMapper memberMapper;

    @Transactional(readOnly = true)
    public MemberInfoDTO getMemberInfo(Long userId) {
        Optional<MemberInfoDTO> optionalMember = memberMapper.findByMemberId(userId);
        if (optionalMember.isEmpty()) {
            throw new UserNotFountException("존재하지 않는 유저입니다.");
        }
        return optionalMember.get();
    }
}
