package list.ordenacao.ordena_numeros;

public class Teste {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenaNumeros numeros = new OrdenaNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenaAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenaDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
