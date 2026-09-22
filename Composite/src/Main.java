import java.util.ArrayList;
import java.util.List;

interface ComponenteEdificio {
    void exibirDetalhes();
}

class Morador implements ComponenteEdificio {
    private String nome;

    public Morador(String nome) {
        this.nome = nome;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("    - Morador: " + nome);
    }
}

class Apartamento implements ComponenteEdificio {
    private String numero;
    private List<ComponenteEdificio> moradores = new ArrayList<>();

    public Apartamento(String numero) {
        this.numero = numero;
    }

    public void adicionar(ComponenteEdificio morador) {
        moradores.add(morador);
    }

    public void remover(ComponenteEdificio morador) {
        moradores.remove(morador);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("  Apartamento " + numero + ":");
        for (ComponenteEdificio morador : moradores) {
            morador.exibirDetalhes();
        }
    }
}

class Edificio implements ComponenteEdificio {
    private String nome;
    private List<ComponenteEdificio> apartamentos = new ArrayList<>();

    public Edificio(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteEdificio apartamento) {
        apartamentos.add(apartamento);
    }

    public void remover(ComponenteEdificio apartamento) {
        apartamentos.remove(apartamento);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Edifício: " + nome);
        for (ComponenteEdificio apartamento : apartamentos) {
            apartamento.exibirDetalhes();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Torre Franciscana");

        Apartamento apto101 = new Apartamento("101");
        Apartamento apto102 = new Apartamento("102");

        apto101.adicionar(new Morador("Bernardo"));
        apto101.adicionar(new Morador("Ana"));

        apto102.adicionar(new Morador("Carlos"));

        edificio.adicionar(apto101);
        edificio.adicionar(apto102);

        edificio.exibirDetalhes();
    }
}