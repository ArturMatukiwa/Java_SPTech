public class ExemploCondicionais {
    public static void main(String[] args) {
        // é igual no java
        // &&
        // ||
        // >
        // <
        // >=
        // <=
        // Cuidado com ==, nunca usar para string

        Integer idade = 19;

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        // EXEMPLO DO QUE NUNCA FAZER!
        // Boolean bloqueadoOuNao = false;
        // if(!bloqueadoOuNao)

        String nome01 = "Bob";
        String nome02 = "Bob";
        String nome03 = "Bob";

        if (nome01.equals(nome02) && !nome01.equals(nome03)) {
            System.out.println("O nome é igual");
        } else {
            System.out.println("O nome é diferente");
        }

        //Operador Ternário
        String resultadoMaiorIdade = idade >= 18 ? "Sim" : "Não"; // mesma lógica do if
        System.out.println("É maior de idade: " + resultadoMaiorIdade);
    }


}