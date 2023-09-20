import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu Nome!");
        String nome = ler.next();

        System.out.println("Digite sua Agencia!");
        String agencia = ler.next();


        System.out.println("Digite o numero da Agencia!");
        int numero = ler.nextInt();


        System.out.println("Quanto de saldo tem na sua conta?!");
        double saldo = ler.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "R$ já está disponível para saque");

    }
}
