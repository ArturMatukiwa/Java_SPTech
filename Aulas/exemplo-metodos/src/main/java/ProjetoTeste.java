import java.util.Scanner;

public class ProjetoTeste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Criando um objeto para utilizar seus métodos
        MetodosUteis metodosLegais = new MetodosUteis();

        System.out.println("Digite seu nome");
        String nomeUsuario = input.nextLine();

        metodosLegais.exibirUsuario(nomeUsuario);
    }
}