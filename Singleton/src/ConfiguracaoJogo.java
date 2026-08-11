public class ConfiguracaoJogo {

    private static ConfiguracaoJogo instancia;

    private int volume;
    private String idioma;

    private ConfiguracaoJogo() {
        this.volume = 50;
        this.idioma = "PT-BR";
    }

    public static ConfiguracaoJogo getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoJogo();
        }
        return instancia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}