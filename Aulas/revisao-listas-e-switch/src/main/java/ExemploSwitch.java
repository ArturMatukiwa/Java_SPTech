import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7");

        Integer diaSemana = leitor.nextInt();

        System.out.println(diaSemana);

//        if(diaSemana == 1) {
//            System.out.println("Domingo");
//        } else if(diaSemana == 2) {
//            System.out.println("Segunda-feira");
//        }else if(diaSemana == 3) {
//            System.out.println("Terça-feira");
//        }else if(diaSemana == 4) {
//            System.out.println("Quarta-feira");
//        }else if(diaSemana == 5) {
//            System.out.println("Quinta-feira");
//        }else if(diaSemana == 6) {
//            System.out.println("Sexta-feira");
//        }else if(diaSemana == 7) {
//            System.out.println("Sabadaço");
//        } else {
//            System.out.println("Dia da semana inválido");
//        }

        switch (diaSemana) {
            case 1, 7:
                System.out.println("Não tem aula!!!");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            default:
                System.out.println("Dia inválido");
        }

//        switch (diaSemana) {
//            case 1, 7 -> {
//                System.out.println("Não tem aula!!!");
//            }
//            case 2 -> {
//                System.out.println("Segunda-Feira");
//            }
//            case 3 -> {
//                System.out.println("Terça-Feira");
//            }
//            case 4 -> {
//                System.out.println("Quarta-Feira");
//            }
//            case 5 -> {
//                System.out.println("Quinta-Feira");
//            }
//            case 6 -> {
//                System.out.println("Sexta-Feira");
//            }
//            default -> {
//                System.out.println("Dia inválido");
//            }

//        String texto = switch (diaSemana) {
//            case 1, 7 -> {
//                "Não tem aula!!!";
//            }
//            case 2 -> {
//                "Segunda-Feira";
//            }
//            case 3 -> {
//                "Terça-Feira";
//            }
//            case 4 -> {
//                "Quarta-Feira";
//            }
//            case 5 -> {
//                "Quinta-Feira";
//            }
//            case 6 -> {
//                "Sexta-Feira";
//            }
//            default -> {
//                "Dia inválido")
//            }
//        }

//            System.out.println(texto);

    }
}
