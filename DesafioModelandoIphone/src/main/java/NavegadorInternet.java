import java.util.List;

public class NavegadorInternet {
    String paginaAtual;
    List<String> historico;

    public void acessarPagina(String url) {
        this.paginaAtual = url;
        this.historico.add(url);
    }

    public void voltar() {
        System.out.println("Voltando para a página anterior");
    }

    public void avancar() {
        System.out.println("Indo para a próxima página");
    }

    public void adicionarAba() {
        System.out.println("Adicionando nova aba");
    }

    public void fecharAba() {
        System.out.println("Fechando aba");
    }

    public void alterarAba(String url) {
        System.out.println("Alterando aba" + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void listarHistorico() {
        for (String pagina : this.historico) {
            System.out.println(pagina);
        }
    }
}
