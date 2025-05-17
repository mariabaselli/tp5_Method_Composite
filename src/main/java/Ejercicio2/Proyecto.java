package Ejercicio2;

import java.time.Period;
import java.util.ArrayList;

public class Proyecto implements ItemDeProyecto {
    private String nombre;
    private ArrayList<ItemDeProyecto> items;

    public Proyecto(String nombre) {
        this.items = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarItems (ItemDeProyecto item) {
        this.items.add(item);
    }

    @Override
    public Period tiempo() {
        Period tiempo = Period.ofDays(0);
        for (ItemDeProyecto item: items) {
            tiempo = tiempo.plus(item.tiempo());
        }
        return tiempo;
    }
}
