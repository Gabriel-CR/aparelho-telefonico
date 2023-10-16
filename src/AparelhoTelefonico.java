public class AparelhoTelefonico {
    private ReprodutorMusica reprodutorMusica;
    private NavegadorInternet navegadorInternet;

    public AparelhoTelefonico() {
        System.out.println("Aparelho Telefonico");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public String toString() {
        return "AparelhoTelefonico [reprodutorMusica=" + reprodutorMusica + ", navegadorInternet=" + navegadorInternet
                + "]";
    }
}
