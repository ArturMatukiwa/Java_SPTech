package school.sptech.ex2;

import java.sql.SQLOutput;

public class TesteEncomendas {

  public static void main(String[] args) {
    Encomenda encomenda = new Encomenda();

    encomenda.tamanho = "M";
    encomenda.enderecoRemetente = "Av. Ulisses Urtigo Urlandio";
    encomenda.enderecoDestinatario = "Rua Vagner Vivêncio Vagner";
    encomenda.distancia = 35.0;
    encomenda.valorProduto = 50.0;


    encomenda.aplicarCupomDeDesconto(20);
    System.out.println(encomenda.valorProduto);

    Double frete = encomenda.calcularFrete();
    System.out.println(frete);


    System.out.println(encomenda.valorTotalDaEncomenda());
  }
}
