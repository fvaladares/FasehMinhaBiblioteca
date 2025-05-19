package br.com.faseh.biblioteca.model;

import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    String jsonLivros;
    Livro[] livros;
    @BeforeEach
    void setUp() {
        livros = new Livro[50];
        jsonLivros = "[\n" +
                "  {\n" +
                "    \"titulo\": \"O mundo assombrado pelos demônios\",\n" +
                "    \"autor\": \"Carl Sagan\",\n" +
                "    \"editora\": \"Companhia das letras\",\n" +
                "    \"edicao\": \"1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"titulo\": \"O codificador limpo\",\n" +
                "    \"autor\": \"Robert C. Martin\",\n" +
                "    \"editora\": \"Alta Books\",\n" +
                "    \"edicao\": \"1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"titulo\": \"O negócio do Jair\",\n" +
                "    \"autor\": \"Juliana Dal Piva\",\n" +
                "    \"editora\": \"Zahar\",\n" +
                "    \"edicao\": \"1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"titulo\": \"E se?\",\n" +
                "    \"autor\": \"Randal Munroe\",\n" +
                "    \"editora\": \"Companhia das letras\",\n" +
                "    \"edicao\": \"1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"titulo\": \"Mentes inquietas\",\n" +
                "    \"autor\": \"Ana Beatriz Barbosa Silva\",\n" +
                "    \"editora\": \"Fontanar\",\n" +
                "    \"edicao\": \"1\"\n" +
                "  }" +
                "]";
        Livro[] temp = new Gson().fromJson(jsonLivros, Livro[].class);
    }

    @Test
    void getLivros() {

        Livro[] temp = new Gson().fromJson(jsonLivros, Livro[].class);
        System.arraycopy(temp, 0, livros, 0, temp.length);

        assertEquals(50, livros.length);
        int qtdLivros = 0;
        for(Livro livro : livros) {
            if (livro != null){
                qtdLivros++;
            }
        }

        assertEquals(5, qtdLivros);
    }
}