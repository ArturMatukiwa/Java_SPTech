package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;
    Double frete = 0.0;


    Double calcularFrete() {
        if(tamanho.equals("P")) {
            frete += valorProduto / 100;
        } else if(tamanho.equals("M")) {
            frete += 3 * valorProduto /100 ;
        } else if(tamanho.equals("G")) {
            frete += 5 * valorProduto /100 ;
        } else {
            return null;
        }

        if(distancia <= 50.0 && distancia > 0) {
            frete += 3.0;
        } else if(distancia <= 200.0) {
            frete += 5.0;
        } else if(distancia > 200.0) {
            frete += 7.0;
        } else {
            return null;
        }

        return frete;
    }

    void aplicarCupomDeDesconto(Integer percentualDesconto) {
        valorProduto -= percentualDesconto * valorProduto /100 ;
    }

    Double valorTotalDaEncomenda() {

        Double frete = calcularFrete();

        return (valorProduto + frete);
    }

}
