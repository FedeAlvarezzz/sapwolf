package co.sapwolf.model.dto;

import co.sapwolf.model.enums.TipoCuenta;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link co.sapwolf.model.entities.Cuenta}
 */
public record CrearCuentaDTO(
        @Size(message = "El usuario debe tener entre 3 y 20 caracteres", min = 3, max = 20) @NotBlank(message = "El usuario no puede estar en blanco") String usuario,
        @Size(message = "La contraseña debe tener entre 3 y 20 caracteres", min = 3, max = 20) @NotBlank(message = "La contraseña no puede estar en blanco") String contrasena,
        @NotNull TipoCuenta tipoCuenta) implements Serializable {
}