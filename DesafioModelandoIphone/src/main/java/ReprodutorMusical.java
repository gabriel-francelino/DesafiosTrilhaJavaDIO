import java.util.List;

public class ReprodutorMusical implements ReprodutorDeMedia{
    String musicaAtual;
    List<String> musicas;

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música " + this.musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume da música");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume da música");
    }

    @Override
    public void selecionar(String media) {
        this.musicaAtual = media;
    }

    @Override
    public void listarTodos() {
        for (String musica : this.musicas) {
            System.out.println(musica);
        }
    }
}
