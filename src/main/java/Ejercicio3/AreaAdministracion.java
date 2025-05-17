package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class AreaAdministracion implements CalculadorSeguro{

    private List<CalculadorSeguro> segurosEmpresa;

    public AreaAdministracion() {
        this.segurosEmpresa = new ArrayList<>();
    }

    void agregarSeguros(List<CalculadorSeguro> seguro) {
        segurosEmpresa = seguro;
    }

    @Override
    public float calcularSeguros() {
        var monto= 0f;
        for (CalculadorSeguro c: segurosEmpresa) {
            monto += c.calcularSeguros();
    }
        return monto;
    }
}
