package Tablas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;                                                                    
import lombok.NoArgsConstructor;

@Entity
@Table(name = "squad")
@Data
@NoArgsConstructor
public class Squad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "module_id", nullable = false)
    private Integer moduleId;

    @NotBlank
    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean status;

    private String commits;
}