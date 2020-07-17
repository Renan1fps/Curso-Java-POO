package br.com.abc.Java.polimorfismo.classes;

public class Vendedor extends Funcionario {
    private double pnv;

    public Vendedor(String nome, double salario, double pnv) {
        super(nome, salario);
        this.pnv = pnv;
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario + (salario + pnv*0.5);

    }

    public double getPnv() {
        return pnv;
    }

    public void setPnv(double pnv) {
        this.pnv = pnv;
    }
}
