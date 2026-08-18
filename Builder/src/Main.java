public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Computador Gamer");
            Computador gamer = new Computador.Builder()
                    .processador("Intel Core i9")
                    .memoriaRAM(32)
                    .armazenamento(2000)
                    .placaVideo("RTX 5070")
                    .sistemaOperacional("Windows 11")
                    .wifi(true)
                    .bluetooth(true)
                    .build();
            gamer.exibirConfiguracao();

            System.out.println("Computador de Escritório");
            Computador escritorio = new Computador.Builder()
                    .processador("Intel Core i5")
                    .memoriaRAM(16)
                    .armazenamento(512)
                    .wifi(true)
                    .build();
            escritorio.exibirConfiguracao();

            System.out.println("Computador Básico");
            Computador basico = new Computador.Builder()
                    .processador("AMD Ryzen 3")
                    .memoriaRAM(8)
                    .armazenamento(256)
                    .sistemaOperacional("Ubuntu Linux")
                    .build();
            basico.exibirConfiguracao();

            // 4. Teste de Validação
            /*
            System.out.println("Criando Computador Inválido...");
            Computador invalido = new Computador.Builder()
                .processador("") // Erro intencional
                .memoriaRAM(0)   // Erro intencional
                .armazenamento(0) // Erro intencional
                .build();
            */

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}