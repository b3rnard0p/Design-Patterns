package br.com.BemEstar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Floresta floresta = new Floresta();

        for (int i = 0; i < 5; i++) {
            floresta.plantarArvore(i * 10, i * 15, "Pinheiro", "pinheiro.png", "Verde Escuro");
        }

        for (int i = 0; i < 5; i++) {
            floresta.plantarArvore(100 + (i * 10), 50 + (i * 5), "Carvalho", "carvalho.png", "Verde Claro");
        }

        for (int i = 0; i < 5; i++) {
            floresta.plantarArvore(200 + (i * 20), 10, "Palmeira", "palmeira.png", "Amarelo/Verde");
        }

        floresta.desenharFloresta();

        System.out.println("Quantidade total de árvores criadas: " + floresta.getTotalArvores());
        System.out.println("Quantidade de objetos TipoArvore instanciados na memória: " + FabricaTipoArvore.getQuantidadeTipos());
    }
}