import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
        * Desafio:
        * - Inserir dados do usuário;
        * - Exibir mensagem para o usuário;
        */
        
        try (Scanner input = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Por favor, digite o número da conta: ");
            int numeroConta = input.nextInt();
            input.nextLine();

            System.out.print("Por favor, digite o número da agência: ");
            String numeroAgencia = input.nextLine();

            System.out.print("Por favor, digite o seu nome: ");
            String nomeCliente = input.nextLine();


            System.out.print("Por favor, digite o seu saldo: ");
            double saldo = input.nextDouble();        
            

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");
        }
    }
}