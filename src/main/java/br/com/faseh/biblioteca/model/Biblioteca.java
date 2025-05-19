package br.com.faseh.biblioteca.model;

import br.com.faseh.biblioteca.model.mock.LivrosMock;

public class Biblioteca {
    // Vetor para armazenar seus livros
    private Livro[] livros;
    private int proximoIdDisponivel;

    public Biblioteca(int qtdLivros) {
        livros = new Livro[qtdLivros];
        System.out.println("Inserindo livros pré cadastrados...");
        buscarLivrosMock();
    }

    private void buscarLivrosMock() {
        Livro[] livrosMock = new LivrosMock().getLivros();

        for (int i = 0; i < livrosMock.length; i++) {
            livros[i] = livrosMock[i];
        }
    }

    public void cadastrarLivro(Livro livroNovo) {

    }

    public Livro[] listarLivros() {
        return this.livros;
    }

    public Livro[] listarLivrosEmprestados() {

        return new Livro[0];
    }

    public Livro emprestarLivro() {

        return null;
    }
}
