import java.util.List;

public class Contato {
    String nome;
    List<String> telefones;

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                '}';
    }
}
