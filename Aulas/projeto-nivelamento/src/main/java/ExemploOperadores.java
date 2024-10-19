public class ExemploOperadores {
    public static void main(String[] args) {

        // Operadores:
        // + soma
        // - subtração
        // / divisão
        // * multiplicação
        // ++
        // --
        // %
        // +=
        // -=
        // *=
        // potência : se utiliza um método "Math.pow()"

        Double numero01 = 42.0;
        Double numero02 = 10.0;

        //Double soma = numero01 + numero02;
        // variavel auxiliar, boa prática usar quando for utilizar
        // mais de uma vez no código

        System.out.println("Soma " + (numero01 + numero02));
        System.out.println("Multiplicação " + (numero01 * numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado Potência: " + resultadoPotencia);

    }
}