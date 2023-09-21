package br.newtonpaiva.com;

import java.util.Scanner;

class Funcionario {
    private String nome;
    private double salarioFixo;

    public Funcionario(String nome, double salarioFixo) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularProventos() {
        return salarioFixo;
    }
}