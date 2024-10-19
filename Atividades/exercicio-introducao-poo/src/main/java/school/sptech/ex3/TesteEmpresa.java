package school.sptech.ex3;

public class TesteEmpresa {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();

    funcionario.nome = "Gilberto";
    funcionario.cargo = "Desenvolvedor";
    funcionario.salario = 4055.0;

    funcionario.reajustarSalario(10);
    System.out.println("Novo salário: " + funcionario.salario);

    Double valorHora = funcionario.calcularValorHora();
    System.out.println("Valor hora: " + valorHora);

    System.out.println("Hora extra: " + funcionario.calcularHoraExtra(10, 20));
  }
}
