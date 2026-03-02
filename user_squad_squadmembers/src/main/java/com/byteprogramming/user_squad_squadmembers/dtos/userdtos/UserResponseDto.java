package com.byteprogramming.user_squad_squadmembers.dtos.userdtos;
import java.time.LocalDateTime;

public record UserResponseDto(
    Integer id,
    String email,
    String name,
    String linkedinUser,
    String githubUser,
    Integer level,
    Integer currentSemester,
    String profilePhoto,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
){}

