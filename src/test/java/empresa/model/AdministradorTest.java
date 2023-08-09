package empresa.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdministradorTest {

    @Test
    public void testCalcularSalario() {
        Administrador administrador = new Administrador("José", "567 Admin St", "555-2468",
                234, 4000.0, 12.0, 300.0);

        double salarioEsperado = 4000.0 - (4000.0 * 12.0 / 100) + 300.0;
        double salarioCalculado = administrador.calcularSalario();

        assertEquals(salarioEsperado, salarioCalculado, 0.001);
    }
}
