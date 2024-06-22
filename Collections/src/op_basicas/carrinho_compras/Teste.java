package op_basicas.carrinho_compras;

public class Teste {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Camiseta", 50.0, 2);
        carrinho.adicionarItem("Calça", 100.0, 1);
        carrinho.adicionarItem("Tênis", 200.0, 1);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();

        carrinho.removerItem("Camiseta");

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
