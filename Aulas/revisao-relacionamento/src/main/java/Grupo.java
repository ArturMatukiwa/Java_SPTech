import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato c) {
        contatos.add(c);
    }

    public void removerPorNome(String nomeRemover) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if(contatoDaVez.getNome().equals(nomeRemover)) {
                contatos.remove(i);
            }
        }
    }

    public void removerPorTipo(String tipoRemover) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if(contatoDaVez.getTipoContato().equals(tipoRemover)) {
                contatos.remove(i);
            }
        }
    }

    public Integer getQuantidadeBloqueados() {
        Integer contadorBloqueados = 0;

        for(Contato contatoAtual : contatos) {
            if(contatoAtual.getBloqueado()) {
                contadorBloqueados++;
            }
        }

        return contadorBloqueados;
    }

    public Double somaValorDoacoes() {
        Double somaDoacoes = 0.0;

        for(Contato contatoAtual : contatos) {
            Double valorAtual = contatoAtual.getValorDoacao();

            somaDoacoes += valorAtual;
        }

        return somaDoacoes;
    }
}
