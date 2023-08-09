package empresa.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperarioTest {

    @Test
    public void testCalcularSalarioComComissao() {
        Operario operario = new Operario("Carlos", "123 Worker St", "555-1357",
                345, 2500.0, 8.0, 10000.0, 5);

        double salarioCalculado = operario.calcularSalario();
        double salarioEsperado = 2500.0 - (2500.0 * 8.0 / 100) + (10000.0 * 5 / 100);

        System.out.println("Informações do Operario:");
        System.out.println(operario);

        System.out.printf("Salário esperado: %.2f%n", salarioEsperado);
        System.out.printf("Salário calculado: %.2f%n", salarioCalculado);

        assertEquals(salarioEsperado, salarioCalculado, 0.001);
    }
}
