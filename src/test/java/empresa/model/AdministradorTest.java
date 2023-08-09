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

        System.out.println("Informações do Administrador:");
        System.out.println(administrador);

        System.out.printf("Salário esperado: %.2f%n", salarioEsperado);
        System.out.printf("Salário calculado: %.2f%n", salarioCalculado);

        assertEquals(salarioEsperado, salarioCalculado, 0.001);
    }
}
