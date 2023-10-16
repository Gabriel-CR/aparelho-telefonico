
public class Aba {
    private String url;
    private String titulo;

    public Aba(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Aba [titulo=" + titulo + ", url=" + url + "]";
    }
}
