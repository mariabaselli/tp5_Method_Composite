package Ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
   // private LogTransaction log;
    private int mesEnPromocion;

    public Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }



    public double calcularPrecio(double precioProducto) {
       double precioTotal = precioProducto;
       if (of(mesEnPromocion).equals(now().getMonth())) {
           precioTotal += precioProducto * porcentajePromoMes();
       }
       else {
           precioTotal += precioProducto * porcentajeSinMesPromo();
       }
      // log.log(nombreClase());
       return precioTotal;
   }

    protected abstract String nombreClase();
    protected abstract double porcentajeSinMesPromo() ;
    protected abstract double porcentajePromoMes();
}