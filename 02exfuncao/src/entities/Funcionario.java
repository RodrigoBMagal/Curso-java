package entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;
    public  double porcentagem;
    public double salarioLiq(){
        return salario - imposto;
    }
    public double aumento(){
        return salarioLiq() + (salario / porcentagem);
    }
    public String toString() {
        return nome
                +", Salario: $ "
                + String.format("%.2f", aumento());
    }
}
