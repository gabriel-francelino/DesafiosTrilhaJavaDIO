import java.util.List;

public class ReprodutorDeVideo implements ReprodutorDeMedia{
    String videoAtual;
    List<String> videos;

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo vídeo " + this.videoAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando vídeo");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume do vídeo");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume do vídeo");
    }

    @Override
    public void selecionar(String media) {
        this.videoAtual = media;
    }

    @Override
    public void listarTodos() {
        for (String video : this.videos) {
            System.out.println(video);
        }
    }
}
