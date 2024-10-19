public class AlunoPos extends Aluno{
    private Double notaTcc;
    private Double notaArtigo;


    public AlunoPos(String ra,
                    String nome,
                    Double notaEntrega,
                    Double notaPratica,
                    Integer qtdFaltas,
                    Double notaTcc,
                    Double notaArtigo) {
        super(ra, nome, notaEntrega, notaPratica, qtdFaltas);
        this.notaTcc = notaTcc;
        this.notaArtigo = notaArtigo;
    }

    @Override
    public Double calcularMedia() {
        return (this.notaEntrega + this.notaPratica + notaTcc + notaArtigo) / 4.0;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }
}
