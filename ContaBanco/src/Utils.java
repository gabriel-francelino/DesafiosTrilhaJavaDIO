import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    public static void validarNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }

        if (nome.length() < 3) {
            throw new IllegalArgumentException("Nome deve ter no mínimo 3 caracteres");
        }

        if (!nome.matches("^[a-zA-Z\\s]*$")) {
            throw new IllegalArgumentException("Nome deve conter apenas letras e espaços");
        }
    }

    public static void validarNumeroConta(int numeroConta) {
        if (numeroConta <= 0) {
            throw new IllegalArgumentException("Número da conta deve ser maior que zero");
        }

        if (String.valueOf(numeroConta).length() != 6) {
            throw new IllegalArgumentException("Número da conta deve ter 6 dígitos");
        }

        if (!String.valueOf(numeroConta).matches("^[0-9]*$")) {
            throw new IllegalArgumentException("Número da conta deve conter apenas números");
        }
    }

    public static void validarAgencia(String agencia) {
        if (agencia == null || agencia.isEmpty()) {
            throw new IllegalArgumentException("Agência não pode ser nula ou vazia");
        }

        if (agencia.length() != 4) {
            throw new IllegalArgumentException("Agência deve ter 4 caracteres");
        }

        if (!agencia.matches("^[0-9]*$")) {
            throw new IllegalArgumentException("Agência deve conter apenas números");
        }
    }

    public static void validarSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo");
        }
    }

    public static String formatarSaldo(double saldo) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return numberFormat.format(saldo);
    }
}
