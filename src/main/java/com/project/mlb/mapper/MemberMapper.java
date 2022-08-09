package com.project.mlb.mapper;

import com.project.mlb.dto.member.MemberInfoDTO;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface MemberMapper {
    Optional<MemberInfoDTO> findByMemberId(@Param("memberId") Long userId);
}
