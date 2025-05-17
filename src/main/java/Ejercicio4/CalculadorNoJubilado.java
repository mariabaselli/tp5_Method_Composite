package Ejercicio4;

public class CalculadorNoJubilado extends Calculador {
    public static final double PORCENTAJE_MES_PROMOCION = 0.15;
    public static final double PORCENTAJE_SIN_MES_PROMOCION = 0.21;
    public static final int MES_EN_PROMOCION = 5;

    public CalculadorNoJubilado() {
        super(MES_EN_PROMOCION);
    }

    @Override
    protected String nombreClase() {
        return (CalculadorNoJubilado.class.getName());
    }


    @Override
    protected double porcentajeSinMesPromo() {
        return PORCENTAJE_SIN_MES_PROMOCION;
    }

    @Override
    protected double porcentajePromoMes() {
        return PORCENTAJE_MES_PROMOCION;
    }
}