package ejercicio5;

import Ejercicio5.RemeraImportada;
import Ejercicio5.RemeraNacional;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemerasTest {

    @Test
    public void verificarRemeraNacional () {
        RemeraNacional remNacional = new RemeraNacional(200);
        assertEquals(186.72, remNacional.calcularPrecioVenta(), 0.1);
    }

    @Test
    public void verificarRemeraImportada () {
        RemeraImportada remImportada = new RemeraImportada(200);
        assertEquals(270, remImportada.calcularPrecioVenta(), 0.1);
    }
}
