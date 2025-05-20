package br.com.faseh.biblioteca.model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int edicao;

    /**
     * Construtor da classe Livro
     * @param titulo
     * @param autor
     * @param editora
     * @param edicao
     */
    public Livro(String titulo,
                 String autor,
                 String editora,
                 int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao=" + edicao +
                '}';
    }
}