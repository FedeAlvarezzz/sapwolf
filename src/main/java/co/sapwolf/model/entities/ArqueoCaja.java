package co.sapwolf.model.entities;

public class ArqueoCaja {

    // Monedas
    public static final int MONEDA_1000 = 1000;
    public static final int MONEDA_500  = 500;
    public static final int MONEDA_200  = 200;
    public static final int MONEDA_100  = 100;
    public static final int MONEDA_50   = 50;

    // Billetes
    public static final int BILLETE_100000 = 100000;
    public static final int BILLETE_50000  = 50000;
    public static final int BILLETE_20000  = 20000;
    public static final int BILLETE_10000  = 10000;
    public static final int BILLETE_5000   = 5000;
    public static final int BILLETE_2000   = 2000;

    private int cantidadMoneda1000;
    private int cantidadMoneda500;
    private int cantidadMoneda200;
    private int cantidadMoneda100;
    private int cantidadMoneda50;
    private int cantidadBillete100000;
    private int cantidadBillete50000;
    private int cantidadBillete20000;
    private int cantidadBillete10000;
    private int cantidadBillete5000;
    private int cantidadBillete2000;

    private Double total;
}
