import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws RuntimeException {

        try {
            Conta conta = criarConta();

            conta.gerarInfo();

        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }

    public static Conta criarConta() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();
        Utils.validarNome(nomeCliente);

        System.out.println("Digite o número da conta: (Ex: 123456)");
        int numeroConta = scanner.nextInt();
        Utils.validarNumeroConta(numeroConta);

        System.out.println("Digite qual é sua agencia: (Ex: 1234)");
        String agencia = scanner.next();
        Utils.validarAgencia(agencia);

        System.out.println("Digite seu saldo inicial: (Ex: 123,45)");
        double saldo = scanner.nextDouble();
        Utils.validarSaldo(saldo);

        scanner.close();

        return new Conta(nomeCliente, numeroConta, agencia, saldo);
    }
}
