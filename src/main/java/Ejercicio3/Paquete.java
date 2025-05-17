package Ejercicio3;

import java.util.ArrayList;

public class Paquete implements CalculadorSeguro {
    public static final int DESCUENTO = 5;
    private String nombrePaquete;
    private ArrayList<CalculadorSeguro> seguros;

    public Paquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
        seguros = new ArrayList<>();
    }

    void agregarSeguro (CalculadorSeguro seguro) {
        seguros.add(seguro);
    }

    @Override
    public float calcularSeguros() {
        var costo = 0f;
        var descuento = 0f;
        for (CalculadorSeguro c: seguros) {
            costo += c.calcularSeguros();
            descuento+= DESCUENTO;
        }
        return (costo - (costo*descuento/100));
    }
}
