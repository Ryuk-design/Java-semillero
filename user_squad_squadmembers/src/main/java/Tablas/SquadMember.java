package Tablas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "squad members")
@NoArgsConstructor
public class SquadMember{

@NotBlank
@Column (name = "Id", nullable = false)
private int id;

@NotBlank
private String squad_role;

@Column (name = "Id", nullable = false)
private String commits;
}

