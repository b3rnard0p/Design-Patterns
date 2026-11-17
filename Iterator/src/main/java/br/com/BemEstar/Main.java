package br.com.BemEstar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        catalogo.adicionar(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        catalogo.adicionar(new Livro("1984", "George Orwell"));
        catalogo.adicionar(new Livro("Dom Quixote", "Miguel de Cervantes"));
        catalogo.adicionar(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        catalogo.adicionar(new Livro("A Revolução dos Bichos", "George Orwell"));

        LivroIterator iterator = catalogo.createIterator();

        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            System.out.println(livro);
        }
    }
}