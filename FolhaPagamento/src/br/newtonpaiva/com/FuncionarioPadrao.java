package br.newtonpaiva.com;

class FuncionarioPadrao extends Funcionario {
    public FuncionarioPadrao(String nome, double salarioFixo) {
        super(nome, salarioFixo);
    }

    @Override
    public double calcularProventos() {
        return getSalarioFixo();
    }
}

class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, double salarioFixo, double comissao) {
        super(nome, salarioFixo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularProventos() {
        return getSalarioFixo() + comissao;
    }
}
