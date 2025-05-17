package Ejercicio2;

import org.junit.Test;

import java.time.Period;

import static org.junit.Assert.assertEquals;

public class ProyectoTest {

    @Test
    public void verificarTiempoTotal () {
        Proyecto proyecto = new Proyecto ("Tp5 OO2");
        HistoriasDeUsuario hu = new HistoriasDeUsuario("Hacer el ejercicio 1");

        Tarea tarea1 = new Tarea ("Definir las clases", Period.ofDays(15));
        hu.agregarItems(tarea1);

        TareaSpike tareaSpike = new TareaSpike("Analizar video enviado", Period.ofDays(1));
        proyecto.agregarItems(hu);
        proyecto.agregarItems(tareaSpike);
        Scrum scrum = new Scrum(proyecto);
        assertEquals( 16, scrum.tiempoEstimado());
    }

    public void verificarTareasSpike() {
        TareaSpike t1= new TareaSpike("Analizar video enviado", Period.ofDays(1));
        TareaSpike t2 = new TareaSpike("Revisar apuntes", Period.ofDays(2));
        Proyecto proyecto = new Proyecto ("Revisar clases");
        proyecto.agregarItems(t1);
        proyecto.agregarItems(t2);
        Scrum scrum = new Scrum(proyecto);
        assertEquals( 3, scrum.tiempoEstimado());
    }


}
