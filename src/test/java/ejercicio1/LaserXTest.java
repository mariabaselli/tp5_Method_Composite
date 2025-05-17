package ejercicio1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaserXTest {

    @Test
    public void sueldoEmpleados() {
        EmpleadoRegular empleadoRegular = new EmpleadoRegular(6500);

        EmpleadoJerarquico liderProyecto = new EmpleadoJerarquico(8500);
        liderProyecto.agregarEmpleado(empleadoRegular);

        EmpleadoJerarquico mandosMedios = new EmpleadoJerarquico(10500);
        mandosMedios.agregarEmpleado(liderProyecto);

        EmpleadoJerarquico gerente = new EmpleadoJerarquico(12500);
        gerente.agregarEmpleado(mandosMedios);

        EmpleadoJerarquico director = new EmpleadoJerarquico(16500);
        director.agregarEmpleado(gerente);

        AreaAdministracion administracion = new AreaAdministracion ();

        assertEquals(54500, administracion.masaSalarialAPartirDe(director));

    }

    @Test
    public void sinSueldoDirector() {
        EmpleadoRegular empleadoRegular = new EmpleadoRegular(6500);

        EmpleadoJerarquico liderProyecto = new EmpleadoJerarquico(8500);
        liderProyecto.agregarEmpleado(empleadoRegular);

        EmpleadoJerarquico mandosMedios = new EmpleadoJerarquico(10500);
        mandosMedios.agregarEmpleado(liderProyecto);

        EmpleadoJerarquico gerente = new EmpleadoJerarquico(12500);
        gerente.agregarEmpleado(mandosMedios);


        AreaAdministracion administracion = new AreaAdministracion ();

        assertEquals(54500, administracion.masaSalarialAPartirDe(gerente));
    }

}
