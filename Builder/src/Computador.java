public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String placaVideo;
    private String sistemaOperacional;
    private boolean wifi;
    private boolean bluetooth;

    private Computador(Builder builder) {
        this.processador = builder.processador;
        this.memoriaRAM = builder.memoriaRAM;
        this.armazenamento = builder.armazenamento;
        this.placaVideo = builder.placaVideo;
        this.sistemaOperacional = builder.sistemaOperacional;
        this.wifi = builder.wifi;
        this.bluetooth = builder.bluetooth;
    }

    public void exibirConfiguracao() {
        System.out.println("Processador: " + processador);
        System.out.println("RAM: " + memoriaRAM );
        System.out.println("Armazenamento: " + armazenamento);

        if (placaVideo != null) {
            System.out.println("Placa de vídeo: " + placaVideo);
        }
        if (sistemaOperacional != null) {
            System.out.println("Sistema operacional: " + sistemaOperacional);
        }

        System.out.println("Wi-Fi: " + (wifi ? "Sim" : "Não"));
        System.out.println("Bluetooth: " + (bluetooth ? "Sim" : "Não"));
    }

    public static class Builder {
        private String processador;
        private int memoriaRAM;
        private int armazenamento;
        private String placaVideo;
        private String sistemaOperacional;
        private boolean wifi;
        private boolean bluetooth;

        public Builder processador(String processador) {
            this.processador = processador;
            return this;
        }

        public Builder memoriaRAM(int memoriaRAM) {
            this.memoriaRAM = memoriaRAM;
            return this;
        }

        public Builder armazenamento(int armazenamento) {
            this.armazenamento = armazenamento;
            return this;
        }

        public Builder placaVideo(String placaVideo) {
            this.placaVideo = placaVideo;
            return this;
        }

        public Builder sistemaOperacional(String sistemaOperacional) {
            this.sistemaOperacional = sistemaOperacional;
            return this;
        }

        public Builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Builder bluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computador build() {
            if (this.processador == null || this.processador.trim().isEmpty()) {
                throw new IllegalArgumentException("Erro: O processador não pode ser vazio.");
            }
            if (this.memoriaRAM <= 0) {
                throw new IllegalArgumentException("Erro: A RAM deve ser maior que zero.");
            }
            if (this.armazenamento <= 0) {
                throw new IllegalArgumentException("Erro: O armazenamento deve ser maior que zero.");
            }

            return new Computador(this);
        }
    }
}