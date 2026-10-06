public class Usuario {
    private String nome;
    private boolean gestor;

    public Usuario(String nome, boolean gestor) {
        this.nome = nome;
        this.gestor = gestor;
    }

    public String getNome() {
        return nome;
    }

    public boolean isGestor() {
        return gestor;
    }
}