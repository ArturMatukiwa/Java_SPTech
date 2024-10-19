import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Contato contato01 = new Contato(
                "Bob da Silva", "1192335-2319", "Admin"
        );

        Contato contato02 = new Contato(
                "Silva da Bob", "1192238-332", "Normal"
        );

        Grupo grupo01 = new Grupo(
                "GRUPO01"
        );

        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        contato01.bloquear();

        contato01.doar(24.6);
        contato02.doar(17.9);

        Integer qtdBloqueado = grupo01.getQuantidadeBloqueados();
        System.out.println(qtdBloqueado);

        Double soma = grupo01.somaValorDoacoes();
        System.out.println(soma);


    }
}
