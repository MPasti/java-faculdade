public class CarItem {
    private int id;
    private int quantidade;
    Product product; //Objeto Parte dentro do objeto Todo.

    public CarItem() {
    }

    public CarItem(int id, int quantidade, Product product) {
        this.setId(id);
        this.setQuantidade(quantidade);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    //PERGUNTA DE PROVA = O TOSTRING DESSA CLASSE, NA PARTE PRODUCT MOSTRA O TOSTRING DA CLASSE PRODUCT
    public String toString() {
        return "\nCarItem{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", product=" + product +
                '}';
    }

}