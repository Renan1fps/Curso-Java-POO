package br.com.abc.Java.polimorfismo.classes;

public class Gerente extends Funcionario {
    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }


    @Override
    public void calculaSalario() {
        this.salario = this.salario + (salario + pnl);

    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
