import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>(
                List.of(6.0, 10.5, 3.25, 8.0, 9.5, 23.75, 109.99, 21.0, 1.99, 1.99));

        RelatorioMetodos metodosRelatorio = new RelatorioMetodos();

//        System.out.println(metodosRelatorio.QuantidadeVendas(precos));
//
//        System.out.println(metodosRelatorio.somarVendas(precos));

//        System.out.println(metodosRelatorio.buscarPreco(precos, 3.25));

//        System.out.println(metodosRelatorio.buscarMaiorPreco(precos));

//        System.out.println(metodosRelatorio.buscarMenorPreco(precos));

        System.out.println(metodosRelatorio.buscarPorPrecoMinimo(precos, 70.0));
    }
}
