package ordenacao.ordena_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaNumeros {
    List<Integer> valores;

    public OrdenaNumeros() {
        this.valores = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        valores.add(numero);
        System.out.println("Valor adicionado na lista!");
    }

    public List<Integer> ordenaAscendente() {
        List<Integer> valoresAscendentes = new ArrayList<>(valores);
        if (!valores.isEmpty()) {
            Collections.sort(valoresAscendentes);
            return valoresAscendentes;
        } else {
            throw new RuntimeException("A lista não pode estar vazia!");
        }
    }

    public List<Integer> ordenaDescendente() {
        List<Integer> valoresDescendentes = new ArrayList<>(valores);
        if (!valores.isEmpty()) {
            valoresDescendentes.sort(Collections.reverseOrder());
            return valoresDescendentes;
        } else {
            throw new RuntimeException("A lista não pode estar vazia!");
        }
    }

    public void exibirNumeros() {
        if (!valores.isEmpty()) {
            System.out.println(this.valores);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
