package exe02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        cartoes.add(new Aniversario("Pedro"));
        cartoes.add(new Aniversario("Matheus"));
        cartoes.add(new Aniversario("Thiago"));

        for(CartaoWeb item: cartoes){
            item.showMessage();
        }
    }
}
