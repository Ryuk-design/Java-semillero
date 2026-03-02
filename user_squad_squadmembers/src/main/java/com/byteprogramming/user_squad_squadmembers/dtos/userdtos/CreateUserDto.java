package com.byteprogramming.user_squad_squadmembers.dtos.userdtos;
import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public record CreateUserDto(

    @Email
    @NotBlank
    String email,

    @NotBlank 
    @Size(min = 3, max = 50)
    String name,

    @NotBlank
    @Pattern(
        regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$",
        message = "La contraseña debe tener mínimo 8 caracteres, una mayúscula, un número y un carácter especial")
    String password,

    @Size (max = 50)
    String linkedinUser,
    
    @Size (max = 50)
    @NotNull
    String githubUser,

    @Min(1) @Max(8)
    @NotNull
    Integer level,

    @Min(1) @Max(20) 
    Integer currentSemester,

    @URL
    String profilePhoto
){}