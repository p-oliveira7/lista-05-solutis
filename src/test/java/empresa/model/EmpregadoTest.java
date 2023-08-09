package empresa.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmpregadoTest {

    @Test
    public void testCalcularSalario() {
        Empregado empregado = new Empregado("Ana", "789 Worker St", "555-9876",
                123, 3000.0, 15.0);

        double salarioEsperado = 3000.0 - (3000.0 * 15.0 / 100);
        double salarioCalculado = empregado.calcularSalario();

        assertEquals(salarioEsperado, salarioCalculado, 0.001);
    }
}
