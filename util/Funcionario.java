package util;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + String.format("%.2f", salario);
    }
}