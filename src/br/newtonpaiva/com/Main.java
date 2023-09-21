package br.newtonpaiva.com;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Ingresso Normal");
            System.out.println("2 - Ingresso VIP");
            System.out.println("3 - Ingresso Camarote");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do ingresso normal: R$");
                    double valorNormal = scanner.nextDouble();
                    Normal ingressoNormal = new Normal(valorNormal);
                    ingressoNormal.imprimeValor();
                    break;
                case 2:
                    System.out.print("Digite o valor do ingresso VIP: R$");
                    double valorVIP = scanner.nextDouble();
                    System.out.print("Digite o valor adicional do ingresso VIP: R$");
                    double valorAdicionalVIP = scanner.nextDouble();
                    VIP ingressoVIP = new VIP(valorVIP, valorAdicionalVIP);
                    ingressoVIP.imprimeValor();
                    break;
                case 3:
                    System.out.print("Digite o valor do ingresso camarote: R$");
                    double valorCamarote = scanner.nextDouble();
                    System.out.print("Digite o valor adicional do ingresso camarote: R$");
                    double valorAdicionalCamarote = scanner.nextDouble();
                    System.out.print("Digite a localização do camarote: ");
                    scanner.nextLine();
                    String localizacaoCamarote = scanner.nextLine();
                    Camarote ingressoCamarote = new Camarote(valorCamarote, valorAdicionalCamarote, localizacaoCamarote);
                    ingressoCamarote.imprimeValor();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
