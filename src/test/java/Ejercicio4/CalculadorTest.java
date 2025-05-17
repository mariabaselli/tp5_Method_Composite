package Ejercicio4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadorTest {

    @Test
    public void verificarCalculadorJubilado () {
        CalculadorJubilado cJubilado = new CalculadorJubilado();
        double v = cJubilado.calcularPrecio(8900);
        assertEquals(9790, v, 0.1);
    }

    @Test
    public void verificarCalculadorNoJubilado () {
        CalculadorNoJubilado cNoJubilado = new CalculadorNoJubilado();
        double v = cNoJubilado.calcularPrecio(8900);
        assertEquals(10235, v, 0.1);
    }
}
