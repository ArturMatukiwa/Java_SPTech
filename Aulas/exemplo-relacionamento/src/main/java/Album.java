import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private Integer qtdPremios;
    private List<Musica> musicas;

    public Album(String nome, Integer qtdPremios) {
        this.nome = nome;
        this.qtdPremios = qtdPremios;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void exibeMusicaPorQtdLikes(Integer qtdMinimaLikes) {
        // for tradicional
//        for (int i = 0; i < musicas.size(); i++) {
//            Musica musicaDaVez = musicas.get(i);
//
//            if(musicaDaVez.getQtdLikes() >= qtdMinimaLikes) {
//                System.out.println(musicaDaVez);
//            }
//        }

        // Enhanced for
        // Não funciona caso seja necessário remover um elemento
        for(Musica musicaDaVez: musicas) {
            if(musicaDaVez.getQtdLikes() >= qtdMinimaLikes) {
                System.out.println(musicaDaVez);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdPremios() {
        return qtdPremios;
    }

    public void setQtdPremios(Integer qtdPremios) {
        this.qtdPremios = qtdPremios;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}