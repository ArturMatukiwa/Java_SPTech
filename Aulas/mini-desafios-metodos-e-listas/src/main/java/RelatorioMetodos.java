import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {
    Integer QuantidadeVendas(List<Double> precos) {
        return precos.size();
    }

    Double somarVendas(List<Double> precos) {
        Double valorTotal = 0.0;
        for (int i = 0; i < precos.size(); i++) {
            valorTotal += precos.get(i);
        }
        return valorTotal;
    }

    Boolean buscarPreco(List<Double> precos, Double precoPesquisa) {
        for (int i = 0; i < precos.size(); i++) {
            if(precos.get(i).equals(precoPesquisa)) {
                return true;
            }
        }
        return false;
    }

    Double buscarMaiorPreco(List<Double> precos) {
        Double maiorPreco = 0.0;

        for (int i = 0; i < precos.size(); i++) {
            if(precos.get(i) > maiorPreco) {
                maiorPreco = precos.get(i);
            }
        }

        return maiorPreco;
    }

    Double buscarMenorPreco(List<Double> precos) {
        Double menorPreco = 100000000000000000.0;

        for (int i = 0; i < precos.size(); i++) {
            if(precos.get(i) < menorPreco) {
                menorPreco = precos.get(i);
            }
        }

        return menorPreco;
    }

    List<Double> buscarPorPrecoMinimo(List<Double> precos, Double precoFiltro) {
        List<Double> precoFiltrado = new ArrayList<>();

        for (int i = 0; i < precos.size(); i++) {
            if(precos.get(i) >= precoFiltro) {
                precoFiltrado.add(precos.get(i));
            }
        }

        return precoFiltrado;
    }
}
