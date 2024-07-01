package Fundamentos.Exemples.SwitchCase;

import java.util.Scanner;

public class RelacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double attSaldo = scanner.nextDouble();
                    saldo = attSaldo;
                    System.out.printf("Saldo atual: %.1f", saldo);
                    break;
                case 2:
                    double valorSacar = scanner.nextDouble();
                    if (valorSacar < saldo){
                        saldo = (saldo - valorSacar);
                        System.out.printf("Saldo atual: %.1f", saldo);
                    }else{
                        System.out.print("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f", saldo);
                    break;
                case 0:
                    System.out.print("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}