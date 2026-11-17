package br.com.BemEstar;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Livro> livros;

    public Catalogo() {
        this.livros = new ArrayList<>();
    }

    public void adicionar(Livro livro) {
        this.livros.add(livro);
    }

    public LivroIterator createIterator() {
        return new CatalogoIterator(this.livros);
    }
}