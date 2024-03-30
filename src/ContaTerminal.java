import java.util.Scanner;

public class ContaTerminal {

    int numeroConta;
    String agenciaConta;
    String nomeCliente;

    public static void main(String[] args){
        float saldo = 5000f;

        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite o numero da sua agencia");
        String agenciaConta = prompt.nextLine();

        System.out.println("Digite o numero da sua conta");
        int numeroConta = prompt.nextInt();
        prompt.nextLine();


        System.out.println("Digite o seu nome");
        String nomeCliente = prompt.nextLine();
        



        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque"); 

    }
}
