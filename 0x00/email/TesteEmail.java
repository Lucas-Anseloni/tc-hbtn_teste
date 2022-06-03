

public class TesteEmail {
    public static boolean testar_email_com_arroba() {
        boolean recebe = Pessoa.emailValid("teste@techcamps.com.br");
        return recebe;
    }

    public static boolean testar_email_sem_arroba() {
        boolean recebe = (!Pessoa.emailValid("teste_techcamps.com.br"));
        return recebe;
    }

    public static boolean testar_email_mais_50_caracteres() {
        boolean recebe = Pessoa.emailValid("teste_techcamps@maisDeCinquenta_caracteres.com.br");
        return recebe;
    }
}
