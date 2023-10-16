import java.util.List;

public class NavegadorInternet {
    private List<Aba> abas;

    public NavegadorInternet() {
        System.out.println("Navegador Internet");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }

    public void abrirNovaAba(String url, String titulo) {
        System.out.println("Abrindo nova aba " + url + " " + titulo);
        this.abas.add(new Aba(url, titulo));
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
