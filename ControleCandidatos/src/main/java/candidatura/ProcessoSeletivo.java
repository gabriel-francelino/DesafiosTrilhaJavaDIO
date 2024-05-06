package candidatura;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo - Candidatura");

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

//        for (String candidato : candidatos) {
//            System.out.println("Candidato: " + candidato);
//            entrarEmContato(candidato);
//        }

        Arrays.stream(candidatos).forEach(ProcessoSeletivo::entrarEmContato);
    }

    static void entrarEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");


    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidados informando o índice do elemento.");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato: " + candidatos[i] + " - Índice: " + i);
        }
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO!");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
        } else {
            System.out.println("AGUARDANDO RESULTADON DOS DEMAIS CANDIDATOS!");
        }
    }
}
