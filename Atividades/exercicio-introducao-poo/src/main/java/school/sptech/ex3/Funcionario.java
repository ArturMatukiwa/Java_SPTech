package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;


    void reajustarSalario(Integer percentualAjuste) {
        salario += (percentualAjuste * salario) / 100;
    }


    Double calcularValorHora() {
        Integer horasTrabalhadasMes = 220;

        return salario / horasTrabalhadasMes;
    }


    Double calcularHoraExtra(Integer horasHoraExtra, Integer percentualAdicionalNoturno) {

        Double valorHora = calcularValorHora();

        Double valorHoraExtra = (horasHoraExtra * valorHora);

        valorHoraExtra += valorHoraExtra * percentualAdicionalNoturno / 100;

        return valorHoraExtra;

    }
}
