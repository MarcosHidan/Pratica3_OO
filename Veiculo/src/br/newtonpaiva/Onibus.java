package br.newtonpaiva;

import javax.swing.*;
final class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        JOptionPane.showMessageDialog(null, "Assentos: " + assentos);
    }
}
