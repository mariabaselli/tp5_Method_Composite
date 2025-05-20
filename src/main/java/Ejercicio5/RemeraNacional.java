package Ejercicio5;

public class RemeraNacional extends Remera{


    public static final double PORCENTAJE_BONIFICACION = 0.20;
    public static final double COSTO_TRANSPORTE = 0.015;
    public static final double GANANCIA_COMERCIO = 0.15;

    public RemeraNacional(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double porcentajeBonificacion() {
        return PORCENTAJE_BONIFICACION;
    }

    @Override
    protected double precioRecargo() {
        return COSTO_TRANSPORTE;
    }

    @Override
    protected double gananciaComercio() {

        return GANANCIA_COMERCIO;
    }
}
