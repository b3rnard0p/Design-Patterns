package br.com.BemEstar;

import java.util.List;

public class CatalogoIterator implements LivroIterator {
    private List<Livro> livros;
    private int posicao = 0;

    public CatalogoIterator(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean hasNext() {
        return posicao < livros.size();
    }

    @Override
    public Livro next() {
        if (this.hasNext()) {
            Livro livro = livros.get(posicao);
            posicao++;
            return livro;
        }
        return null;
    }
}