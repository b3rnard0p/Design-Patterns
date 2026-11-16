package br.com.BemEstar;
import java.util.ArrayList;
import java.util.List;

public class Floresta {
    private List<Arvore> arvores = new ArrayList<>();

    public void plantarArvore(int x, int y, String especie, String imagem, String cor) {
        TipoArvore tipo = FabricaTipoArvore.getTipo(especie, imagem, cor);
        Arvore arvore = new Arvore(x, y, tipo);
        arvores.add(arvore);
    }

    public void desenharFloresta() {
        for (Arvore arvore : arvores) {
            arvore.desenhar();
        }
    }

    public int getTotalArvores() {
        return arvores.size();
    }
}