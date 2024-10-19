import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {
    Integer avaliandoSorte(Integer valor) {
       Integer numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);

       Integer contador = 1;
       while(!numAleatorio.equals(valor)) {
           contador++;
           numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
       }

        System.out.println(contador);
        return contador;
    }

    Integer exibaSomaSorteio() {
        Integer numAleatorio = ThreadLocalRandom.current().nextInt(0,11);

        Integer soma = 0;

        while(!numAleatorio.equals(0)) {
            soma += numAleatorio;
            numAleatorio = ThreadLocalRandom.current().nextInt(0,11);
        }

        System.out.println(soma);
        return soma;
    }

    void exibeImpares() {
        for(Integer i = 0; i <= 90; i++) {
            Integer resto = i % 2;

            if(resto.equals(1)) {
                System.out.println(i);
            }
        }
    }

    Integer posicaoSorteio(Integer numero) {

        Integer posPrimeiraVez = -1;

        for(int i = 1; i <= 200; i++) {
            Integer numAleatorio = ThreadLocalRandom.current().nextInt(0, 101);

            if(numAleatorio.equals(numero) && posPrimeiraVez.equals(-1)) {
                System.out.println(numAleatorio);
                System.out.println(i);
                posPrimeiraVez = i;
            }
        }

        return posPrimeiraVez;
    }
}
