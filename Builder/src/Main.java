public class Main {
    public static void main(String[] args) {
        Computador gamer = new Computador.Builder()
                .processador("Intel Core i9")
                .memoriaRAM(32)
                .armazenamento(2000)
                .placaVideo("RTX 5070")
                .sistemaOperacional("Windows 11")
                .wifi(true)
                .bluetooth(true)
                .build();

        Computador escritorio = new Computador.Builder()
                .processador("Intel Core i5")
                .memoriaRAM(16)
                .armazenamento(512)
                .wifi(true)
                .build();

        Computador basico = new Computador.Builder()
                .processador("AMD Ryzen 3")
                .memoriaRAM(8)
                .armazenamento(256)
                .sistemaOperacional("Linux")
                .build();

        gamer.exibirConfiguracao();
        escritorio.exibirConfiguracao();
        basico.exibirConfiguracao();
    }
}