interface Botao { void exibir(); }
interface Menu { void exibir(); }
interface Checkbox { void exibir(); }

class BotaoWindows implements Botao { public void exibir() { System.out.println("Exibindo botão do Windows."); } }
class MenuWindows implements Menu { public void exibir() { System.out.println("Exibindo menu do Windows."); } }
class CheckboxWindows implements Checkbox { public void exibir() { System.out.println("Exibindo checkbox do Windows."); } }

class BotaoLinux implements Botao { public void exibir() { System.out.println("Exibindo botão do Linux."); } }
class MenuLinux implements Menu { public void exibir() { System.out.println("Exibindo menu do Linux."); } }
class CheckboxLinux implements Checkbox { public void exibir() { System.out.println("Exibindo checkbox do Linux."); } }

class BotaoMac implements Botao { public void exibir() { System.out.println("Exibindo botão do Mac."); } }
class MenuMac implements Menu { public void exibir() { System.out.println("Exibindo menu do Mac."); } }
class CheckboxMac implements Checkbox { public void exibir() { System.out.println("Exibindo checkbox do Mac."); } }

interface FabricaInterface {
    Botao criarBotao();
    Menu criarMenu();
    Checkbox criarCheckbox();
}

class FabricaWindows implements FabricaInterface {
    public Botao criarBotao() { return new BotaoWindows(); }
    public Menu criarMenu() { return new MenuWindows(); }
    public Checkbox criarCheckbox() { return new CheckboxWindows(); }
}

class FabricaLinux implements FabricaInterface {
    public Botao criarBotao() { return new BotaoLinux(); }
    public Menu criarMenu() { return new MenuLinux(); }
    public Checkbox criarCheckbox() { return new CheckboxLinux(); }
}

class FabricaMac implements FabricaInterface {
    public Botao criarBotao() { return new BotaoMac(); }
    public Menu criarMenu() { return new MenuMac(); }
    public Checkbox criarCheckbox() { return new CheckboxMac(); }
}

class Aplicacao {
    private Botao botao;
    private Menu menu;
    private Checkbox checkbox;

    public Aplicacao(FabricaInterface fabrica) {
        this.botao = fabrica.criarBotao();
        this.menu = fabrica.criarMenu();
        this.checkbox = fabrica.criarCheckbox();
    }

    public void executar() {
        botao.exibir();
        menu.exibir();
        checkbox.exibir();
    }
}

public class Main {
    public static void main(String[] args) {
        FabricaInterface fabricaWin = new FabricaWindows();
        Aplicacao appWin = new Aplicacao(fabricaWin);
        appWin.executar();

        FabricaInterface fabricaLin = new FabricaLinux();
        Aplicacao appLin = new Aplicacao(fabricaLin);
        appLin.executar();

        FabricaInterface fabricaMac = new FabricaMac();
        Aplicacao appMac = new Aplicacao(fabricaMac);
        appMac.executar();
    }
}