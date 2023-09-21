package br.newtonpaiva.com;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário fixo do funcionário: R$");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1 - Funcionário Padrão");
        System.out.println("2 - Funcionário Comissionado");
        System.out.println("3 - Funcionário de Produtividade");
        int escolha = scanner.nextInt();

        Funcionario funcionario;

        switch (escolha) {
            case 1:
                funcionario = new FuncionarioPadrao(nome, salarioFixo);
                break;
            case 2:
                System.out.print("Digite o valor da comissão do funcionário: R$");
                double comissao = scanner.nextDouble();
                funcionario = new FuncionarioComissionado(nome, salarioFixo, comissao);
                break;
            case 3:
                System.out.print("Digite a quantidade de unidades produzidas pelo funcionário: ");
                int unidadesProduzidas = scanner.nextInt();
                System.out.print("Digite o valor por unidade: R$");
                double valorPorUnidade = scanner.nextDouble();
                funcionario = new FuncionarioProdutividade(nome, salarioFixo, unidadesProduzidas, valorPorUnidade);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double proventos = funcionario.calcularProventos();
        System.out.println("Proventos de " + funcionario.getNome() + ": R$" + proventos);

        scanner.close();
    }
}