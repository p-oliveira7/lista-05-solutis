package empresa.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FornecedorTest {

    @Test
    public void testObterSaldo() {
        Fornecedor fornecedor = new Fornecedor("Maria", "789 Supplier St", "555-7890",
                5000.0, 2000.0);

        double saldoEsperado = 5000.0 - 2000.0;
        double saldoCalculado = fornecedor.obterSaldo();

        System.out.println("Informações do Fornecedor:");
        System.out.println(fornecedor);

        System.out.printf("Saldo esperado: %.2f%n", saldoEsperado);
        System.out.printf("Saldo calculado: %.2f%n", saldoCalculado);

        assertEquals(saldoEsperado, saldoCalculado, 0.001);
    }
}
