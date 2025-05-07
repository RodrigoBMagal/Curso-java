package entities;

public class Estudante {
    public double nota1;
    public double nota2;
    public double nota3;
    public double minima = 60;
    public double total() {
        return nota1 + nota2 + nota3;
    }
    public double falta(){
        return minima - total();
    }

}
