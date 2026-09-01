public class ComputadorFacade {
    private Fonte fonte;
    private Processador processador;
    private Memoria memoria;
    private Disco disco;
    private SistemaOperacional sistemaOperacional;

    public ComputadorFacade() {
        this.fonte = new Fonte();
        this.processador = new Processador();
        this.memoria = new Memoria();
        this.disco = new Disco();
        this.sistemaOperacional = new SistemaOperacional();
    }

    public void ligarComputador() {
        fonte.ligar();
        processador.iniciar();
        memoria.carregar();
        disco.iniciar();
        sistemaOperacional.carregar();
        System.out.println("Computador pronto para uso.");
    }

    // Desafio Adicional: Desligar Computador
    public void desligarComputador() {
        sistemaOperacional.encerrar();
        disco.desligar();
        memoria.liberar();
        processador.desligar();
        fonte.desligar();
        System.out.println("Computador desligado de maneira segura.");
    }
}