

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    @Test
    public void testar_email_com_arroba() {
        assertTrue(Pessoa.emailValid("teste@techcamps.com.br"));
    }

    @Test
    public void testar_email_sem_arroba() {
        assertFalse(Pessoa.emailValid("testetechcamps.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        boolean expected = false;
        assertEquals(expected,Pessoa.emailValid("teste_techcamps@maisDeCinquenta_caracteres.com.br"));
    }
}
