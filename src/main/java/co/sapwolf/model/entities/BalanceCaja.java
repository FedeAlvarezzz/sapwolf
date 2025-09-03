package co.sapwolf.model.entities;

import co.sapwolf.model.enums.MetodoPago;

import java.time.LocalDate;
import java.util.List;

public class BalanceCaja {

    private List<Moto> motos;
    private List<Pago> pagos;
    private LocalDate tiempo;
    private LocalDate horaEntrada;
    private LocalDate horaSalida;
    private List<MetodoPago> metodos;
    private Double total;

}
