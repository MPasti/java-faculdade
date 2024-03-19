import rh.Assistente;
import rh.Diretor;
import rh.Gerente;

//o main não pode ficar dentro do pacote de rh pq ele não depende da herança
public class Main {
    public static void main(String[] args) {
        Assistente as1 = new Assistente("Zezin", "São Paulo", "49128282101", 1000f, 3f);
        Gerente gt1 = new Gerente("Roberto", "Franca", "09229149340", 3000f, 500f);
        Diretor dt1 = new Diretor("Pedras", "São Paulo", "32192102194", 5000f, 1000f);

        System.out.print(gt1.toString());
        System.out.print(as1.toString());
        System.out.print(dt1.toString());
    }
}