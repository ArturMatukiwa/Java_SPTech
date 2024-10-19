import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public Double somaNotaEntregas() {
        Double soma = 0.0;

        for(Aluno alunoAtual : alunos) {
            soma += alunoAtual.getNotaEntrega();
        }

        return soma;
    }

    public Double somaNotaEntregas(Double notaMinima) {
        Double soma = 0.0;

        for(Aluno alunoAtual : alunos) {
            if(alunoAtual.getNotaEntrega() > notaMinima) {
            soma += alunoAtual.getNotaEntrega();
            }
        }

        return soma;
    }

    public List<Aluno> buscaAlunoPorNome(String nomeBusca) {
        List<Aluno> alunosFiltrados = new ArrayList<>();

        for(Aluno alunoAtual : alunos) {
            if(alunoAtual.getNome().contains(nomeBusca)) {
                alunosFiltrados.add(alunoAtual);
            }
        }

        return alunosFiltrados;
    }



    public void deletarAlunos() {
        alunos.clear();
    }

}
