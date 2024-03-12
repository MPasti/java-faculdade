import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    private List<CarItem> carItem;

    public ShoppingCart() {
        //alocar espaço na memória para o vetor
        this.carItem = new ArrayList<CarItem>();
    }

    //O CONSTRUTOR COM PARÂMETRO NÃO FAZ COM O CARITENS POIS NÃO TEM COMO CRIAR O CARITEM SE ELE NÃO
    // FOR INICIALIZADO PREVIAMENTE

    public ShoppingCart(int id, float totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.carItem = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CarItem> getCarItem() {
        return carItem;
    }

    public void setCarItem(List<CarItem> carItem) {
        this.carItem = carItem;
    }

    // método para adicionar um CarItem no vetor
    // caracteriza uma composição, pois CarItem é criado
    // em função do ShoppingCart
    public void addCarItem(int id, int quantity, Product product){
        // cria um CarItem e adiciona este no vetor
        this.carItem.add(new CarItem(id, quantity, product));
        calculateTotalPrice();
    }
    public void calculateTotalPrice(){
        this.totalPrice = 0;
        for (CarItem Item : carItem){
            this.totalPrice += Item.getQuantidade() * Item.getProduct().getPrice();
        }
    }

    @Override
    public String toString() { //O TOSRING 'shopingcart' É UMA LISTA, VAI MOSTRAR TODOS OS 'CARITEM's'
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", carItem=" + carItem +
                '}';
    }
}