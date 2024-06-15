import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco,\nsua agência é " + agencia + ",conta " + numeroConta + ", e seu saldo  " + saldo + " já está disponível para saque.");

    }
}
