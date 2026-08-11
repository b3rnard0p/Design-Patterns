//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfiguracaoJogo instancia1 = ConfiguracaoJogo.getInstancia();
        instancia1.setVolume(10);

        ConfiguracaoJogo instancia2 = ConfiguracaoJogo.getInstancia();
        System.out.println(instancia2.getVolume());

        System.out.println((instancia1 == instancia2));
    }
}