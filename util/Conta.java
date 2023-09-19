package util;

public class Conta {
    private int numeroDaConta;
    private String nome;
    private double valorDepositado;
    private double taxa = 5.00;

    public Conta(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta; // Usa "this" para se referir ao campo da classe.
        this.nome = nome;
    }

    public Conta(int numeroDaConta, String nome, double valorDepositado) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.valorDepositado = valorDepositado;
    }

    //Get e Set
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorDepositado() {
        return valorDepositado;
    }
    public void setValorDepositado(double valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    //Deposito e saque
    public void deposito(double valorDepositado){
        this.valorDepositado += valorDepositado;
    }
    public void saque(double valorDepositado){
        this.valorDepositado -= (valorDepositado + taxa);
    }
    
    public String toString() {
        return "Conta: "
        + numeroDaConta 
        + " ,Titular: "
        + nome
        + " ,Saldo: $"
        + String.format("%.2f", valorDepositado);
    }
}
