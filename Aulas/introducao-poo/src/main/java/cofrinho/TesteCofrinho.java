package cofrinho;

public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho cofrinho01 = new Cofrinho(
                false,
                "Playstation 5",
                4250.0);

        Cofrinho cofrinho02 = new Cofrinho(
                false,
                "Bike",
                4250.0);

        Cofrinho cofrinho03 = new Cofrinho(
                false,
                "Playstation 5",
                4250.0);

        cofrinho01.depositar(31300.0);
        cofrinho01.depositar(10.0, 5.0);

        cofrinho01.agitar();
        Double valorGuardado = cofrinho01.quebrar();

        cofrinho01.setMeta("Comprar livro Java");

        Boolean consguiuComprar = cofrinho01.comprar(valorGuardado);

        if(consguiuComprar) {
            System.out.println("Comprado!");
        } else {
            System.out.println("Não foi possível comprar");
        }
    }
}
