package op_basicas.carrinho_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item novoItem = new Item(nome, preco, quantidade);
        carrinho.add(novoItem);
        System.out.println("Item adicionado ao carrinho");
    }

    public void removerItem(String nome){
        for (Item item : carrinho) {
            if (item.getNome().equals(nome)) {
                if (item.getQuantidade() == 1) {
                    carrinho.remove(item);
                    System.out.println("Item removido do carrinho");
                }else {
                    item.setQuantidade(item.getQuantidade() - 1);
                    System.out.println("Quantidade do item reduzida");
                }
            }
        }
        System.out.println("Item não encontrado no carrinho");
    }

    public void calcularValorTotal() {
        double total = 0;

        for (Item item: carrinho) {
            total += item.getPreco() * item.getQuantidade();
        }

        System.out.println("O valor total dos itens do carrinho é: " + total);
    }

    public void exibirItens() {
        for (Item item : carrinho) {
            System.out.println("Nome: " + item.getNome() + " - Preço: " + item.getPreco() + " - Quantidade: " + item.getQuantidade());
        }
    }
}
