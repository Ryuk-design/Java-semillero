package com.byteprogramming.user_squad_squadmembers.dtos.userdtos;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UpdateUser(
    
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

    @URL
    String profilePhoto
) 
{}