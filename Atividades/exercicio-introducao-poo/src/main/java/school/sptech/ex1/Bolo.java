package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer quantidadeDesejada) {
        if(quantidadeDesejada > 0 && quantidadeDesejada < quantidadeEmEstoque) {
            quantidadeVendida += quantidadeDesejada;
            quantidadeEmEstoque -= quantidadeDesejada;
        }
    }

    void aumentarEstoque(Integer quantidadeAdicionada) {
        if(quantidadeAdicionada >= 0) {
            quantidadeEmEstoque += quantidadeAdicionada;
        }
    }

    Integer quantidadeDisponivel() {
        return quantidadeEmEstoque;
    }

    Double totalVendido() {
        return valor * quantidadeVendida;
    }
}
