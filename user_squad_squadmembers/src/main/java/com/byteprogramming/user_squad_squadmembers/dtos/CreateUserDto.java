package com.byteprogramming.user_squad_squadmembers.dtos;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CreateUserDto(

    @Email
    @NotBlank
    String email,

    @NotBlank
    String name,

    @NotBlank
    @Pattern(
        regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$",
        message = "La contraseña debe tener mínimo 8 caracteres, una mayúscula, un número y un carácter especial")
    String password,

    String linkedinUser,
    String githubUser,

    @Min(1) @Max(8)
    Integer level,

    @Min(1) @Max(20)
    Integer currentSemester,

    String profilePhoto
){}