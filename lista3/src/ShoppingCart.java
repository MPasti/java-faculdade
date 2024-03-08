import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    private List<CarItem> carItens;

    public ShoppingCart() {
        // aloca espaço na memória para o vetor
        this.carItens = new ArrayList<CarItem>();
    }
    public ShoppingCart(int id, float totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
        // aloca espaço na memória para o vetor
        this.carItens = new ArrayList<CarItem>();
    }
}