public class OperacoesMatematicas {
    public static void main(String[] args) {

        ScannerOperacoes scanner = new ScannerOperacoes();

        Integer opcaoEscolhida = scanner.leitorOpcao();

        while(opcaoEscolhida < 1 || opcaoEscolhida > 4) {
            System.out.println("Opção inválida!");
            opcaoEscolhida = scanner.leitorOpcao();
        }

        Double valor1;
        Double valor2;

        while (!opcaoEscolhida.equals(4)) {
            switch (opcaoEscolhida) {
                case 1:
                    valor1 = scanner.leitorValor();
                    valor2 = scanner.leitorValor();
                    System.out.println("Resultado: " + (valor1 + valor2));

                    opcaoEscolhida = scanner.leitorOpcao();
                    break;
                case 2:
                    valor1 = scanner.leitorValor();
                    valor2 = scanner.leitorValor();
                    System.out.println("Resultado: " + (valor1 - valor2));

                    opcaoEscolhida = scanner.leitorOpcao();
                    break;
                case 3:
                    valor1 = scanner.leitorValor();
                    valor2 = scanner.leitorValor();
                    System.out.println("Resultado: " + (valor1 * valor2));

                    opcaoEscolhida = scanner.leitorOpcao();
                    break;
            }
        }

        System.out.println("Programa encerrado");
    }
}
