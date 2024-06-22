package op_basicas.lista_tarefas;

public class Teste {
    public static void main(String[] args) {
        ListaTarefa tarefas = new ListaTarefa();

        tarefas.adicionarTarefa("tarefa x");
        tarefas.adicionarTarefa("tarefa y");
        tarefas.adicionarTarefa("tarefa z");

        tarefas.obterNumeroTotalTarefas();

        tarefas.obterDescricoesTarefas();

        tarefas.removerTarefa("tarefa y");

        tarefas.obterDescricoesTarefas();
    }
}
