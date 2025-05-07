package entities;

public class Conta {
    public String nome;
    public int numconta;
    public double saldo;
    public String opcao;
    public void novoNome(String nome) { this.nome = nome; }
    public void deposito(double saldo){this.saldo += saldo;}
    public void sacar(double saldo){this.saldo -= (saldo + 5);}


}
