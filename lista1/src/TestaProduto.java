public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Camiseta", 10, 29.99);
        Produto produto2 = new Produto(2, "Calça", 15, 30.00);

        produto1.comprar(5);
        produto1.vender(2);

        produto1.subir(5.0);
        produto2.descer(3.0);

        System.out.println("Informações do Produto 1:");
        produto1.mostra();

        System.out.println();

        System.out.println("Informações do Produto 2:");
        produto2.mostra();
    }
}