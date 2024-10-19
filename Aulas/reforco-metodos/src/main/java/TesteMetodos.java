public class TesteMetodos {
    public static void main(String[] args) {
        MetodosDivertidos metodosDivertidos = new MetodosDivertidos();

//        Integer testeSorte = metodosDivertidos.avaliandoSorte(4);
//
//        if(testeSorte <= 3) {
//            System.out.println("Você é MUITO sortudo");
//        } else if(testeSorte <= 10) {
//            System.out.println("Você é sortudo");
//        } else {
//            System.out.println("É melhor você parar de apostar e ir trabalhar");
//        }

//        Integer testeSoma = metodosDivertidos.exibaSomaSorteio();
//
//        System.out.println("A soma dos números é " + testeSoma);

//        metodosDivertidos.exibeImpares();


        Integer testePosicao = metodosDivertidos.posicaoSorteio(5);

        if(testePosicao.equals(-1)) {
            System.out.println("O número não foi sorteado");
        } else{
            System.out.println(testePosicao);
        }
    }
}
