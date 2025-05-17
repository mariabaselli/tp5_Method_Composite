package Ejercicio2;

import java.time.LocalDate;
import java.time.Period;

public class Tarea implements ItemDeProyecto{
    private Period tiempo;
    private String nombre;

    public Tarea(String nombre, Period tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public Period tiempo() {
        return this.tiempo;
    }
}
