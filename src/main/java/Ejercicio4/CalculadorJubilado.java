package Ejercicio4;

public class CalculadorJubilado extends Calculador {
    static final double PORCENTAJE_JUBILADO = 0.1;
    public static final int MES_EN_PROMOCION = 5;

    public CalculadorJubilado() {
        super(MES_EN_PROMOCION);
    }

    @Override
    protected double porcentajeSinMesPromo() {
        return 0;
    }

    @Override
    protected double porcentajePromoMes() {
        return PORCENTAJE_JUBILADO;
    }

    @Override
    protected String nombreClase() {
       return (CalculadorJubilado.class.getName());
    }
}