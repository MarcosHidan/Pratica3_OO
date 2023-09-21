package br.newtonpaiva.com;

class FuncionarioProdutividade extends Funcionario {
    private int unidadesProduzidas;
    private double valorPorUnidade;

    public FuncionarioProdutividade(String nome, double salarioFixo, int unidadesProduzidas, double valorPorUnidade) {
        super(nome, salarioFixo);
        this.unidadesProduzidas = unidadesProduzidas;
        this.valorPorUnidade = valorPorUnidade;
    }

    public int getUnidadesProduzidas() {
        return unidadesProduzidas;
    }

    public void setUnidadesProduzidas(int unidadesProduzidas) {
        this.unidadesProduzidas = unidadesProduzidas;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(double valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    @Override
    public double calcularProventos() {
        return getSalarioFixo() + (unidadesProduzidas * valorPorUnidade);
    }
}
