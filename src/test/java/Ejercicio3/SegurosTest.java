package Ejercicio3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SegurosTest {


    @Test
    public void segurosSinPaquetes() {
        Seguro seguroCasa = new Seguro ("C1", 45000);
        Seguro seguroVida = new Seguro ("C2", 23467);
        AreaAdministracion admin = new AreaAdministracion();
        admin.agregarSeguros(List.of(seguroCasa, seguroVida));
        assertEquals(68467, admin.calcularSeguros(), 0.1f);
    }

    @Test
    public void segurosEnPaquetes() {
        Seguro seguroCasa = new Seguro ("C1", 45000);
        Seguro seguroVida = new Seguro ("C2", 23467);
        Paquete p1 = new Paquete ("Combo Familiar");
        p1.agregarSeguro(seguroCasa);
        p1.agregarSeguro(seguroVida);
        AreaAdministracion admin = new AreaAdministracion();
        admin.agregarSeguros(List.of(p1));
        assertEquals(61620.3, admin.calcularSeguros(), 0.1f);
    }

    @Test
    public void paquetesEnPaquetes () {
        Paquete p1 = new Paquete ("Combo Familiar");

        Seguro seguroCasa = new Seguro ("C1", 45000);
        Seguro seguroVida = new Seguro ("C2", 23467);

        p1.agregarSeguro(seguroVida);
        p1.agregarSeguro(seguroCasa);

        Paquete p2 = new Paquete ("Combo Pareja");

        Seguro seguroAuto2 = new Seguro ("C3", 13489);
        Seguro seguroCasa2 = new Seguro ("C1", 4567);

        p2.agregarSeguro(seguroAuto2);
        p2.agregarSeguro(seguroCasa2);

        p1.agregarSeguro(p2);

        AreaAdministracion admin = new AreaAdministracion();
        admin.agregarSeguros(List.of(p1));

        assertEquals(72009.79, admin.calcularSeguros(), 0.1f);        ;

    }

}
