package br.newtonpaiva;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String placa, strAno, strAssentos, strEixos;
        int ano, assentos, eixos;

        placa = JOptionPane.showInputDialog("Digite a placa do ônibus:");
        strAno = JOptionPane.showInputDialog("Digite o ano do ônibus:");
        ano = Integer.parseInt(strAno);
        strAssentos = JOptionPane.showInputDialog("Digite o número de assentos do ônibus:");
        assentos = Integer.parseInt(strAssentos);

        Onibus onibus = new Onibus(placa, ano, assentos);
        onibus.exibirDados();

        placa = JOptionPane.showInputDialog("Digite a placa do caminhão:");
        strAno = JOptionPane.showInputDialog("Digite o ano do caminhão:");
        ano = Integer.parseInt(strAno);
        strEixos = JOptionPane.showInputDialog("Digite o número de eixos do caminhão:");
        eixos = Integer.parseInt(strEixos);

        Caminhao caminhao = new Caminhao(placa, ano, eixos);
        caminhao.exibirDados();
    }
}