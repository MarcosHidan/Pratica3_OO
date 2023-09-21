package br.newtonpaiva;

import javax.swing.JOptionPane;

class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo() {
        this("", 0);
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Dados do veículo:\nPlaca: " + placa + "\nAno: " + ano);
    }
}
