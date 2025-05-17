package Ejercicio5;

public class RemeraImportada extends Remera{

    public static final double COSTO_RECARGO = 0.03;
    public static final double IMPUESTO_ADUANERO = 0.05;
    public static final double GANANCIA_COMERCIO = 0.25;

    public RemeraImportada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double porcentajeBonificacion() {
        return 0;
    }

    @Override
    protected double precioRecargo() {
        return COSTO_RECARGO + IMPUESTO_ADUANERO;
    }

    @Override
    protected double gananciaComercio() {
        return GANANCIA_COMERCIO;
    }
}


