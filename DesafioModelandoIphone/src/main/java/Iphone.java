public class Iphone {
    ReprodutorDeMedia reprodutorMusica;
    ReprodutorDeMedia reprodutorVideo;
    AparelhoTelefonico aparelhoTelefonico;
    NavegadorInternet navegadorInternet;

    public Iphone() {
        reprodutorMusica = new ReprodutorMusical();
        reprodutorVideo = new ReprodutorDeVideo();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }
}
