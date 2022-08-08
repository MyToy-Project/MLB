package com.project.mlb.mapper;

import com.project.mlb.dto.login.MemberInfoResponseDTO;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface MemberMapper {
    Optional<MemberInfoResponseDTO> findByUserId(@Param("userId") Long userId);
}
