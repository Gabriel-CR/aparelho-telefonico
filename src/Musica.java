import java.sql.Time;

public class Musica {
    private String nome;
    private String artista;
    private Time duracao;

    public Musica(String nome, String artista, Time duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "musica [nome=" + nome + ", artista=" + artista + ", duracao=" + duracao + "]";
    }

    
}
