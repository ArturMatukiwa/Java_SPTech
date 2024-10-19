import java.util.Scanner;

public class ScannerOperacoes {
    Integer leitorOpcao() {
        Scanner leitor = new Scanner(System.in);

        System.out.println(""" 
                \nEscolha uma opção:
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Sair
                """);

        Integer opcaoEscolhida = leitor.nextInt();
        return opcaoEscolhida;
    }

    Double leitorValor() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor");

        Double valor = leitor.nextDouble();
        return valor;
    }
}
