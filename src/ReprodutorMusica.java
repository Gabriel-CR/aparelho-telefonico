import java.util.List;

public class ReprodutorMusica {
    private List<Musica> musicas;

    public ReprodutorMusica() {
        System.out.println("Reprodutor Musica");
    }

    public void tocar(Musica musica) {
        System.out.println("Tocando musica " + musica);
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(int indice) {
        Musica musica = this.musicas.get(indice);
        System.out.println("Selecionando " + musica);
    }
}
