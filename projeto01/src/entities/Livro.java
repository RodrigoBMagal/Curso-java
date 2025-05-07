package entities;

public class Livro extends Produto {
    private String autor;
    private String editora;
    private String sinopse;

    public Livro() {
    }

    public Livro(String autor, String editora, String sinopse) {
        this.autor = autor;
        this.editora = editora;
        this.sinopse = sinopse;
    }

    public Livro(String nome, String autor, String editora, String sinopse) {
        super(nome);
        this.autor = autor;
        this.editora = editora;
        this.sinopse = sinopse;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override

    public String toString() {
        return "Nome: " + getNome()
                + "\nAutor: " + autor
                + "\nEditora: " + editora
                + "\nSinopse: " + sinopse;
    }
}
