package school.sptech.ex1;

public class TesteConfeitaria {

  public static void main(String[] args) {

    Bolo relatorioBolo = new Bolo();


    relatorioBolo.sabor = "Morango";
    relatorioBolo.valor = 25.6;
    relatorioBolo.quantidadeVendida = 12;
    relatorioBolo.quantidadeEmEstoque = 8;

    relatorioBolo.venderBolo(2);
    System.out.println(relatorioBolo.quantidadeVendida);
    System.out.println(relatorioBolo.quantidadeEmEstoque);

    relatorioBolo.aumentarEstoque(10);
    System.out.println(relatorioBolo.quantidadeEmEstoque);

    System.out.println(relatorioBolo.quantidadeDisponivel());


    Double totalVendido = relatorioBolo.totalVendido();
    System.out.println(totalVendido);

  }
}
