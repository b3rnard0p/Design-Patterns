package br.com.BemEstar;

public class TipoArvore {
    private final String especie;
    private final String imagem;
    private final String cor;

    public TipoArvore(String especie, String imagem, String cor) {
        this.especie = especie;
        this.imagem = imagem;
        this.cor = cor;
    }

    public void desenhar(int x, int y) {
        System.out.println("Desenhando " + especie + " (" + cor + ") na posição [" + x + ", " + y + "] usando " + imagem);
    }
}