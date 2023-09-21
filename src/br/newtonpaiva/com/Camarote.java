package br.newtonpaiva.com;

class Camarote extends Ingresso {
    private double valorAdicional;
    private String localizacao;

    public Camarote(double valor, double valorAdicional, String localizacao) {
        super(valor);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public void imprimeValor() {
        double valorTotal = getValor() + valorAdicional;
        System.out.println("Ingresso Camarote - Valor: R$" + valorTotal + " - Localização: " + localizacao);
    }
}
