public class Conta {
    private String nomeCliente;
    private int numeroConta;
    private String agencia;
    private double saldo;

    public Conta(String nomeCliente, int numeroConta, String agencia, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeClinte) {
        this.nomeCliente = nomeClinte;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void gerarInfo() {
        String mensagemDeBoasVindas = "Olá " + this.nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo de " + Utils.formatarSaldo(saldo) + " já está disponível para saque.";
        System.out.println(mensagemDeBoasVindas);
    }
}
