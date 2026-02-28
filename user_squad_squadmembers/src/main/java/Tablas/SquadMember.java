package com.byteprogramming.squadmembers.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Entity
@Data
@Table(name = "squad members")
@NoArgsConstructor
public class SquadMember{

@NotBlank(nullable = false)
@Column (name = "Id", nullable = false)
private int id;

@NotBlank(nullable = false)
private String squad_role;

@Column (name = "Id", nullable = false)
private String commits;
}

