public class Produto {
    private int id;
    private String descricao;
    private int qtde;
    private double preco;

    public Produto(int id, String descricao, int qtde, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }


    public void comprar(int x) {
        qtde += x;
    }


    public void vender(int x) {
        if (qtde >= x) {
            qtde -= x;
        } else {
            System.out.println("Quantidade em estoque insuficiente.");
        }
    }


    public void subir(double x) {
        preco += x;
    }


    public void descer(double x) {
        if (preco >= x) {
            preco -= x;
        } else {
            System.out.println("Preço não pode ser menor que zero.");
        }
    }

    public void mostra() {
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade em estoque: " + qtde);
        System.out.println("Preço: R$ " + preco);
    }
}
