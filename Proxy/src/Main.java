public class Main {
    public static void main(String[] args) {
        Usuario bernardo = new Usuario("Bernardo", false);
        Usuario rafael = new Usuario("Rafael", true);

        Video videoComum = new VideoProxy("Introducao ao Git", bernardo, false);
        Video videoRestrito = new VideoProxy("Lideranca Estrategica", bernardo, true);
        Video videoRestritoGerente = new VideoProxy("Lideranca Estrategica", rafael, true);

        System.out.println("Cenario 1: Sucesso - Acesso permitido e Lazy Initialization");
        videoComum.reproduzir();

        System.out.println("\nCenario 2: Sucesso - Reutilizacao de Cache");
        videoComum.reproduzir();

        System.out.println("\nCenario 3: Falha - Acesso Negado ");
        videoRestrito.reproduzir();

        System.out.println("\nCenario 4: Sucesso - Acesso Permitido");
        videoRestritoGerente.reproduzir();
    }
}