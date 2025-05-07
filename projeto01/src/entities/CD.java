package entities;

public class CD extends Produto {

    private String artista;
    private int ano;
    private String genero;

    public CD() {
    }

    public CD(String artista, int ano, String genero) {
        this.artista = artista;
        this.ano = ano;
        this.genero = genero;
    }

    public CD(String nome, String artista, int ano, String genero) {
        super(nome);
        this.artista = artista;
        this.ano = ano;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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
                + "\nArtista: " + artista
                + "\nAno: " + ano
                + "\nGenero: " + genero;
    }
}
