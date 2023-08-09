package empresa.model;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendedorTest {

    @Test
    public void testCalcularSalarioComComissao() {
        Vendedor vendedor = new Vendedor("João", "456 Sales St", "555-5678",
                567, 2800.0, 10.0, 15000.0, 0.07);

        double salarioEsperado = 2800.0 - (2800.0 * 10.0 / 100) + (15000.0 * 0.07);
        double salarioCalculado = vendedor.calcularSalario();

        assertEquals(salarioEsperado, salarioCalculado, 0.001);
    }
}

