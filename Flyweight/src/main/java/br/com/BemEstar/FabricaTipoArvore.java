package br.com.BemEstar;
import java.util.HashMap;
import java.util.Map;

public class FabricaTipoArvore {
    private static final Map<String, TipoArvore> tipos = new HashMap<>();

    public static TipoArvore getTipo(String especie, String imagem, String cor) {
        String chave = especie + "-" + imagem + "-" + cor;
        if (!tipos.containsKey(chave)) {
            tipos.put(chave, new TipoArvore(especie, imagem, cor));
            System.out.println(">>> Novo TipoArvore criado: " + especie);
        }
        return tipos.get(chave);
    }

    public static int getQuantidadeTipos() {
        return tipos.size();
    }
}