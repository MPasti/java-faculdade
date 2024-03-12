public class Main {
    public static void main(String[] args) {

        Product prod1 = new Product(1, 6.5f, "Bolacha");
        Product prod2 = new Product(2, 2.5f, "Chocolate");
        Product prod3 = new Product(3, 10f, "Pães de Queijo");

        ShoppingCart carrinho1 = new ShoppingCart(100, 0f);
        carrinho1.addCarItem(10,10, prod1);
        carrinho1.addCarItem(11,5, prod2);
        System.out.println(carrinho1.toString());

        ShoppingCart carrinho2 = new ShoppingCart(200,0f);
        carrinho2.addCarItem(13,10, prod3);
        carrinho2.addCarItem(11,5, prod2);
        System.out.println(carrinho2.toString());

    }
}