package controller;

public class Processo {
    private String nome;
    private int qtdRetornos;

    public Processo(String nome, int qtdRetornos) {
        this.nome = nome;
        this.qtdRetornos = qtdRetornos;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdRetornos() {
        return qtdRetornos;
    }

    public void decrementaRetornos() {
        this.qtdRetornos--;
    }
}