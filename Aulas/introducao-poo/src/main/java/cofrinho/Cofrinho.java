package cofrinho;

import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    // Atributos
    private Double dinheiroGuardado;
    private Boolean quebrado;
    private String meta;
    private Double valorMeta;

//    Método vs Construtor
//    Precisa especificar retorno x construtor não possui
//    Padrão de nomes: camelCase x Pascal Case
//    Qualquer nome x Mesmo nome da Classe
//    Chama quando quiser x chama na instancia


    // public em métodos: todas as classes de todo o projeto pode acessar
    // default (vazio): as classes do mesmo pacote podem acessar

    // Construtor
    public Cofrinho(Boolean quebrado, String meta, Double valorMeta) {
        this.dinheiroGuardado = 0.0;
        this.quebrado = quebrado;
        this.meta = meta;
        this.valorMeta = valorMeta;
}

    // Construtor sobrecarregado
    public Cofrinho(Boolean quebrado, Double valorMeta) {
        this.dinheiroGuardado = 0.0;
        this.quebrado = quebrado;
        this.meta = "Não possui";
        this.valorMeta = valorMeta;
    }

    // Métodos
    void depositar(Double valor) {
        if(podeDepositar((valor))) {
            dinheiroGuardado += valor;
        } else {
            System.out.println("Você já quebrou o cofrinho!");
        }
    }

    private Boolean podeDepositar(Double valorDeposito) {
        if(!quebrado && valorDeposito > 0.0) {
            return true;
        }
        return false;
    }

    // Método sobrecarregado (metodo com mesmo nome de outro mas com argumentos diferentes)
    void depositar(Double valor, Double valorDesconto) {
        if(podeDepositar((valor))) {
            dinheiroGuardado += valor;
        } else {
            System.out.println("Você já quebrou o cofrinho!");
        }
    }

    Double agitar() {
        if(!quebrado) {
            Double valorRetornado = ThreadLocalRandom.current().nextDouble(0, dinheiroGuardado);

            System.out.println("Valor retornado ao agitar " + valorRetornado);
            dinheiroGuardado -= valorRetornado;

            return valorRetornado;
        }

        System.out.println("Você já quebrou o cofrinho!");

        return null;
    }

    Double quebrar() {
        if(!quebrado) {
            Double valorRetirado = dinheiroGuardado;
            dinheiroGuardado =  0.0;
            quebrado = true;

            return valorRetirado;
        }
        System.out.println("Você já quebrou o cofrinho!");

        return null;
    }

    public Double getDinheiroGuardado() {
        return dinheiroGuardado;
    }

    public void setDinheiroGuardado(Double dinheiroGuardado) {
        this.dinheiroGuardado = dinheiroGuardado;
    }

    public Boolean getQuebrado() {
        return quebrado;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(Double valorMeta) {
        this.valorMeta = valorMeta;
    }

    Boolean comprar(Double valorUsuario) {
        if(!quebrado) {
            System.out.println("Quebre o cofrinho para receber o dinheiro");

            return false;
        } else if(valorUsuario < valorMeta) {
            System.out.println("Você não possui dinheiro o suficiente");
            return false;
        }
            return true;
    }

}
