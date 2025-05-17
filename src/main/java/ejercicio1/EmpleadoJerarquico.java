package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico extends Empleados{
    private int sueldo;
    private List<Empleados> empleados;

    public EmpleadoJerarquico(int sueldo) {
        this.sueldo = sueldo;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleados empleado) {
        empleados.add(empleado);
    }
    @Override
    int calcularSueldoTotal() {
        int resultado = 0;
        for (Empleados e : empleados) {
            resultado += e.calcularSueldoTotal();
        }
        return resultado + this.sueldo;
    }
    }

