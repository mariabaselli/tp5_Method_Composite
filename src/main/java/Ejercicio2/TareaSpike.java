package Ejercicio2;

import java.time.Period;

public class TareaSpike implements ItemDeProyecto{
    private Period tiempo;
    private String nombre;

    public TareaSpike(String nombre, Period tiempo) {
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    @Override
    public Period tiempo() {
        return this.tiempo;

    }
}
