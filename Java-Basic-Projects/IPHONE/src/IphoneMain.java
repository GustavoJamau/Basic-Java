public class IphoneMain {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando funcionalidades
        iphone.tocar();
        iphone.selecionarMusica("Bohemian Rhapsody - Queen");
        iphone.pausar();

        iphone.ligar("11987654321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
