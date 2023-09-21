package br.newtonpaiva.com;

class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeValor() {
        double valorTotal = getValor() + valorAdicional;
        System.out.println("Ingresso VIP - Valor: R$" + valorTotal);
    }
}
