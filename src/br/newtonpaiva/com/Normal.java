package br.newtonpaiva.com;

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimeValor() {
        System.out.println("Ingresso Normal - Valor: R$" + getValor());
    }
}