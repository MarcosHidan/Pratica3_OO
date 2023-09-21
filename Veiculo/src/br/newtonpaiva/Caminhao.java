package br.newtonpaiva;

import javax.swing.*;
final class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        JOptionPane.showMessageDialog(null, "Número de eixos: " + eixos);
    }
}
