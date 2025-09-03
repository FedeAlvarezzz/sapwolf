package co.sapwolf.model.entities;

import co.sapwolf.model.enums.TipoCuenta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "cuenta")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_cuenta", nullable = false, unique = true)
    private Integer id;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String contrasena;

    @Enumerated
    @Column(nullable = false)
    private TipoCuenta tipoCuenta;
}
