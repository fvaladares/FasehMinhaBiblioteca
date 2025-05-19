package br.com.faseh.biblioteca.model.mock;

import br.com.faseh.biblioteca.model.Livro;
import com.google.gson.Gson;

public class LivrosMock {
    private final String jsonLivros = """
            [
              {
                "titulo": "O mundo assombrado pelos demônios",
                "autor": "Carl Sagan",
                "editora": "Companhia das letras",
                "edicao": "1"
              },
              {
                "titulo": "O codificador limpo",
                "autor": "Robert C. Martin",
                "editora": "Alta Books",
                "edicao": "1"
              },
              {
                "titulo": "O negócio do Jair",
                "autor": "Juliana Dal Piva",
                "editora": "Zahar",
                "edicao": "1"
              },
              {
                "titulo": "E se?",
                "autor": "Randal Munroe",
                "editora": "Companhia das letras",
                "edicao": "1"
              },
              {
                "titulo": "Mentes inquietas",
                "autor": "Ana Beatriz Barbosa Silva",
                "editora": "Fontanar",
                "edicao": "1"
              }
            ]""";

    public Livro[] getLivros() {
        Livro[] livros;
        livros = new Gson().fromJson(jsonLivros, Livro[].class);
        return livros;
    }

}
