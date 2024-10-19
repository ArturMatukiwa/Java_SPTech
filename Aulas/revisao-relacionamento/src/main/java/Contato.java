public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;
    private String tipoContato;
    private Double valorDoacao;


    public Contato(String nome, String telefone, String tipoContato) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
        this.tipoContato = tipoContato;
        this.valorDoacao = 0.0;
    }

    public void bloquear() {
        bloqueado = true;
    }

    public void desbloquear() {
        bloqueado = false;
    }

    public void doar(Double valorDoacao) {
        this.valorDoacao += valorDoacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public Double getValorDoacao() {
        return valorDoacao;
    }


    @Override
    public String toString() {


        return """
                Nome: %s
                Telefone: %s
                Bloqueado: %s
                """.formatted(nome, telefone, bloqueado ? "Sim" : "Não");
    }
}
