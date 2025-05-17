package Ejercicio5;

public abstract class Remera {
    private double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioVenta () {
        var precioVenta= precioUnitario;
        precioVenta += precioVenta * precioRecargo();
        precioVenta -= (precioVenta*porcentajeBonificacion());
        precioVenta += precioVenta * gananciaComercio();
        return precioVenta;

    }

    protected abstract double porcentajeBonificacion();
    protected abstract double precioRecargo();
    protected abstract double gananciaComercio();
}
