package br.com.faseh.biblioteca;

import br.com.faseh.biblioteca.model.Biblioteca;
import br.com.faseh.biblioteca.model.Livro;
import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt;
        Scanner input = new Scanner(System.in);


        printLn("\n");
        printLn(".:: Boas vindas à sua biblioteca!! ::.\n\n");
        printLn("""
                Inicializando nova biblioteca...
                informe a quantidade de posições desejada:\s""");
        prompt();
        opt = input.nextInt();

        Biblioteca biblioteca = new Biblioteca(opt);

        do {
            System.out.println();
            printLn("Menu: ");
            printLn("1\t Listar todos os livros.");
            printLn("2\t Listar todos os livros emprestados.");
            printLn("3\t Cadastrar novo livro.");
            printLn("4\t Remover livro.");
            printLn("5\t Emprestar livro.");
            printLn("0\t SAIR.");
            System.out.println();
            System.out.print("Insira sua opção:> ");

            try {
                opt = input.nextInt();
                switch (opt) {
                    case 0:
                        System.out.println();
                        System.out.println();
                        printLn("Até breve!");
                        break;
                    case 1:
                        printLn("Carregando listagem de livros...");
                        exibirListaLivros(biblioteca.listarLivros());
                        break;
                    case 2:
                        //TODO(NOT IMPLEMENTED YET)
                        printLn("Listando livros emprestados...");
                        break;
                    case 3:
                        printLn("Iniciando processo de cadastro...\n");
                        Livro novoLivro = cadastrarNovoLivro(input);
                        biblioteca.cadastrarLivro(novoLivro);
                        biblioteca.listarLivros();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        printLn("Opção inválida, tente novamente;");
                        break;

                }
            } catch (Exception e) {
                printLn("Você inseriu um caracter inválido!");
                printLn("Tente novamente!!");
                limparCache(input);
//                opt = 10;
            }
        } while (opt != 0);

        printLn("Programa encerrado!!!");
    }

    private static void limparCache(Scanner input) {
//        if (input.hasNext()) {
        input.skip("\n");
//            String trash = input.nextLine();
//            System.out.println("Esta linha pode ser removida, usada apenas para teste!!\n valor lixo:" + trash);
//            System.out.println();
//        }
    }

    private static void printLn(String x) {
        System.out.println(x);
    }

    private static Livro cadastrarNovoLivro(Scanner input) {
        System.out.println();
        printLn("Cadatro de novo livro");

        limparCache(input);

        System.out.println();
        printLn("Título: ");
        prompt();
        String titulo = input.nextLine();


        System.out.println();
        printLn("Autor: ");
        prompt();
        String autor = input.nextLine();


        System.out.println();
        printLn("Edição: ");
        prompt();
        int edicao = input.nextInt();

        limparCache(input);
        System.out.println();
        printLn("Editora: ");
        prompt();
        String editora = input.nextLine();
        Livro novoLivro = new Livro(titulo,
                autor,
                editora,
                edicao);

        return novoLivro;

    }

    private static void prompt() {
        System.out.print(":> ");
    }

    private static void exibirListaLivros(Livro[] livros) {
        // foreach
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro);
            }
        }
    }
}