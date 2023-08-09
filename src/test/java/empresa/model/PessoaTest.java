package empresa.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaTest {

    @Test
    public void testToString() {
        Pessoa pessoa = new Pessoa("João", "123 Main St", "555-1234");

        String expectedString = "Pessoa{" +
                "nome='João', endereco='123 Main St', telefone='555-1234'}";
        String actualString = pessoa.toString();

        System.out.println("Informações da Pessoa:");
        System.out.println(pessoa);

        assertEquals(expectedString, actualString);
    }
}
