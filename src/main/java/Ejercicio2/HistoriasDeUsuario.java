package Ejercicio2;

import java.time.Period;
import java.util.ArrayList;

public class HistoriasDeUsuario implements ItemDeProyecto {
    private ArrayList<ItemDeProyecto> tareas;
    private String nombre;

    public HistoriasDeUsuario(String nombre) {
        this.tareas = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarItems (ItemDeProyecto tareas) {
        this.tareas.add(tareas);
    }


    @Override
    public Period tiempo() {
        Period tiempo = Period.ofDays(0);
        for (ItemDeProyecto item: tareas) {
            tiempo = tiempo.plus(item.tiempo());
        }
        return tiempo;
    }
}
