package com.project.mlb.mapper;

import com.project.mlb.vo.Member;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface MemberMapper {
    Optional<Member> findByMemberId(@Param("memberId") Long userId);

    Optional<Member> findByLoginId(@Param("loginId") String loginId);

    void signUp(Member member);
}
