public class Musica {
    private String nome;
    private String artista;
    private Double minutos;
    private Integer qtdLikes;

    public Musica(String nome, String artista, Double minutos) {
        this.nome = nome;
        this.artista = artista;
        this.minutos = minutos;
        this.qtdLikes = 0;
    }


    public void curtir() {
        qtdLikes++;
    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Double getMinutos() {
        return minutos;
    }

    public void setMinutos(Double minutos) {
        this.minutos = minutos;
    }

    public Integer getQtdLikes() {
        return qtdLikes;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Artista: %s
                Minutos: %.2f
                Likes: %d
                """.formatted(nome, artista, minutos, qtdLikes);
    }
}