package com.byteprogramming.user_squad_squadmembers.dtos.leadersdtos;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record LeaderUserManagement(

    @Email
    String email,

    @Size(min = 2, max = 50)
    String name,

    @Pattern(
        regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$",
        message = "La contraseña debe tener mínimo 8 caracteres, una mayúscula, un número y un carácter especial")
    String password,

    @Size(max = 50)
    String linkedinUser,

    @Size(max = 50)
    String githubUser,

    @Min(1) @Max(8)
    Integer level,

    @Min(1) @Max(20)
    Integer currentSemester,

    @URL
    String profilePhoto,

    Boolean status,

    String role
) {}
