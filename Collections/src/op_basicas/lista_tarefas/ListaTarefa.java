package op_basicas.lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
        System.out.println("Nova tarefa adicionada!");
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasASeremRemovidas =  new ArrayList<>();

        for (Tarefa tarefa: tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefasASeremRemovidas.add(tarefa);
            }
        }

        tarefas.removeAll(tarefasASeremRemovidas);
        System.out.println("As tarefas com a descrição '" + descricao + "' foram removidas!");
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("O número total de tarefas é: " + tarefas.size());
    }

    public void obterDescricoesTarefas() {
        System.out.println("Descrições das tarefas:\n");

        for (int i=0; i < tarefas.size(); i++) {
            String descricao = tarefas.get(i).getDescricao();
            System.out.println("Tarefa " + i + ": " + descricao);
        }
    }
}
