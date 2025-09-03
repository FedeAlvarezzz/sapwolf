package co.sapwolf.model.entities;

import co.sapwolf.model.enums.Tarifa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "moto")
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "moto_seq")
    @SequenceGenerator(name = "moto_seq")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String placa;

    @Enumerated
    @Column(nullable = false)
    private Tarifa tarifa;
}