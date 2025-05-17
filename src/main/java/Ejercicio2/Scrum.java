package Ejercicio2;

import java.time.Period;

public class Scrum {
    private Proyecto proyecto;

    public Scrum(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public int tiempoEstimado() {
       return proyecto.tiempo().getDays();
    }
}
