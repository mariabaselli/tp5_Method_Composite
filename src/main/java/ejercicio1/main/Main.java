package ejercicio1.main;

import ejercicio1.AreaAdministracion;
import ejercicio1.EmpleadoJerarquico;
import ejercicio1.EmpleadoRegular;

public class Main {
    public static void main(String[] args) {

        EmpleadoRegular empleadoRegular = new EmpleadoRegular(6500);
        EmpleadoJerarquico liderProyecto = new EmpleadoJerarquico(8500);
        liderProyecto.agregarEmpleado(empleadoRegular);
        EmpleadoJerarquico mandosMedios = new EmpleadoJerarquico(10500);
        mandosMedios.agregarEmpleado(liderProyecto);
        EmpleadoJerarquico  gerente = new EmpleadoJerarquico (12500);
        gerente.agregarEmpleado(mandosMedios);
        EmpleadoJerarquico  director = new EmpleadoJerarquico (16500);
        director.agregarEmpleado(gerente);

        AreaAdministracion administracion = new AreaAdministracion();
        var sueldoTotal = administracion.masaSalarialAPartirDe(director);


        System.out.println("La masa salarial de Lase X es: " +  sueldoTotal);
    }
}