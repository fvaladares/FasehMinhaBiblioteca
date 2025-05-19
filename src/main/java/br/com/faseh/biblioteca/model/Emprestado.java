package br.com.faseh.biblioteca.model;

public enum Emprestado {
    EMPRESTADO(1),
    DISPONIVEL(2);

    private final int valor;

    Emprestado(int valorOpcao) {
        valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }
}
