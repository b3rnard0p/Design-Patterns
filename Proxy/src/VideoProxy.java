public class VideoProxy implements Video {
    private VideoReal videoReal;
    private String titulo;
    private Usuario usuario;
    private boolean restritoParaGestores;

    public VideoProxy(String titulo, Usuario usuario, boolean restritoParaGestores) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.restritoParaGestores = restritoParaGestores;
    }

    @Override
    public void reproduzir() {
        if (restritoParaGestores && !usuario.isGestor()) {
            System.out.println("Acesso negado: O usuario " + usuario.getNome() + " nao tem permissao para " + titulo);
            return;
        }

        if (videoReal == null) {
            videoReal = new VideoReal(titulo);
        }

        videoReal.reproduzir();
    }
}