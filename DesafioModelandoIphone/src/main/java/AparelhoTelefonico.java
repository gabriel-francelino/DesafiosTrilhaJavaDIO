import java.util.List;

public class AparelhoTelefonico {
    List<Contato> contatos;

    public void ligar(Contato contato) {
        System.out.println("Ligando para " + contato.nome);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void desligar() {
        System.out.println("Desligando chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void salvarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato.toString());
        }
    }
}
