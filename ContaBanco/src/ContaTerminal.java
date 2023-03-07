import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da agência:");
            int numeroAgencia = scanner.nextInt();
            scanner.nextLine(); // consumir o '\n' deixado pelo nextInt()

            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo inicial:");
            double saldoInicial = scanner.nextDouble();

            System.out.println("Obrigado por criar uma conta em nosso banco!");
            System.out.println("Seus dados bancários são:");
            System.out.println("Agência: " + numeroAgencia);
            System.out.println("Conta: " + gerarNumeroConta());
            System.out.println("Nome do cliente: " + nomeCliente);
            System.out.println("Saldo: " + saldoInicial);
        }
    }
    public static String gerarNumeroConta() {
        // gerar um número de conta aleatório de 6 dígitos
        int numeroConta = (int) (Math.random() * 900000) + 100000;
        return String.valueOf(numeroConta);
    }
}
