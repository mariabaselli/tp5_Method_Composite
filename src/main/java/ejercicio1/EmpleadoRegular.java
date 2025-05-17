package ejercicio1;

public class EmpleadoRegular extends Empleados {
    private int sueldo;

    public EmpleadoRegular(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    int calcularSueldoTotal() {
        return this.sueldo;
    }
}
