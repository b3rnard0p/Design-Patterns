

public class Main {
    public static void main(String[] args) {
        Bebida cafe1 = new CafeSimples();
        System.out.println("Bebida: " + cafe1.getDescricao());
        System.out.printf("Preço: R$ %.2f\n\n", cafe1.getPreco());

        Bebida cafe2 = new CafeSimples();
        cafe2 = new LeiteDecorator(cafe2);
        cafe2 = new ChocolateDecorator(cafe2);
        System.out.println("Bebida: " + cafe2.getDescricao());
        System.out.printf("Preço: R$ %.2f\n\n", cafe2.getPreco());

        Bebida cafe3 = new CafeSimples();
        cafe3 = new LeiteDecorator(cafe3);
        cafe3 = new ChocolateDecorator(cafe3);
        cafe3 = new ChantillyDecorator(cafe3);
        cafe3 = new CarameloDecorator(cafe3);
        System.out.println("Bebida: " + cafe3.getDescricao());
        System.out.printf("Preço: R$ %.2f\n\n", cafe3.getPreco());

        Bebida cafe4 = new CafeSimples();
        cafe4 = new ChocolateDecorator(cafe4);
        cafe4 = new ChocolateDecorator(cafe4);
        cafe4 = new ChantillyDecorator(cafe4);
        System.out.println("Bebida: " + cafe4.getDescricao());
        System.out.printf("Preço: R$ %.2f\n\n", cafe4.getPreco());
    }
}