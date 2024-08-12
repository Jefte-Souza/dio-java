import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo!, por favor digite o número da agencia: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o saldo para depósito: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá "+nome+", obrigado por criar sua conta, sua agência é "+agencia+", conta "+numero+", seu saldo "+saldo+", já disponível para saque.");
        
        sc.close();
    }
}
