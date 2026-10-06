public class VideoReal implements Video {
    private String titulo;

    public VideoReal(String titulo) {
        this.titulo = titulo;
        carregarVideoDoServidor();
    }

    private void carregarVideoDoServidor() {
        System.out.println("Carregando video: " + titulo);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo: " + titulo);
    }
}