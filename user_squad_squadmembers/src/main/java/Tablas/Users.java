package com.byteprogramming.user_squad_squadmembers.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Email
    @NotBlank
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Column(nullable = false)
    @Pattern(
    regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$",
    message = "La contraseña debe tener mínimo 8 caracteres, una mayúscula, un número y un carácter especial")
    private String password;

    @Column(unique = true, name = "linkedin_user")
    private String linkedinUser;

    @Column(unique = true, name = "github_user")
    private String githubUser;

    @Min(1) @Max(8)
    private Integer level;

    @Min(1) @Max(20)
    private Integer currentSemester;

    @Column(name = "current_semester")
    private Integer currentSemester;

    @Column(unique = true, name = "profile_photo")
    private String profilePhoto;

    @Column(nullable = false)
    private Boolean status;
}


