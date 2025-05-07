package entities;

public class DVD extends Produto{
    private int ano;
    private String diretor;
    private String genero;

    public DVD(){
    }

    public DVD(int ano, String diretor, String genero) {
        this.ano = ano;
        this.diretor = diretor;
        this.genero = genero;
    }

    public DVD(String nome, int ano, String diretor, String genero) {
        super(nome);
        this.ano = ano;
        this.diretor = diretor;
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override

    public String toString() {
        return "Nome: " + getNome()
                + "\nAno: " + getAno()
                + "\nDiretor: " + getDiretor()
                + "\nGenero: " + getGenero();
    }
}
