package Ejercicio3;

public class Seguro implements CalculadorSeguro {
    private float costo;
    private String nombre;

    public Seguro(String nombre, float costo) {
           this.nombre = nombre;
        this.costo = costo;
    }

    @Override
    public float calcularSeguros() {
        return this.costo;
    }
}
