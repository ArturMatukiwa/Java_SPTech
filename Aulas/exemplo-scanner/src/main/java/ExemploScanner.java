import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); //Objeto no Java
        // Scanner leitorNL = new Scanner(System.in); //Variável para ser usada em todos os nextLine()

        // leitor.nextDouble)();
        // leitor.nextInt();

        /*
        Pergunte o nome, idade, e altura
        e exiba usando interpolação
        */
        System.out.println("Digite seu nome");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Digite sua idade");
        Integer idadeUsuario = leitor.nextInt();

        System.out.println("Digite sua altura");
        Double alturaUsuario = leitor.nextDouble();

        System.out.println("""
                O nome digitado foi: %s
                A idade digitada foi: %d
                A altura digitada foi: %.2f
                """.formatted(nomeUsuario, idadeUsuario, alturaUsuario));
    }
}