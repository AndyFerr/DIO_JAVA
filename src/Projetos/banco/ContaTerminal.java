package Projetos.banco;

import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter your account number:");
        int number = in.nextInt();

        System.out.println("Please, enter your agency number:");

        String agencyNumber = in.next();

        System.out.println("Please, enter your name:");

        String clientName = in.next();

        System.out.println("Please, enter your balance:");

        Double balance = in.nextDouble();

        in.close();

        System.out.println("Olá " + clientName+", obrigado por criar uma conta em nosso banco, sua agência é "+agencyNumber+", conta "+number+" e seu saldo "+balance+" já está disponível para saque.");

    }
}
