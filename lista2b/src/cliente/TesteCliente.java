package cliente;
import cliente.Cliente;
public class TesteCliente {
    public static void main(String[] args) {

        Cliente fulano = new Cliente("12345-12", "123-23", "Fulano", 1000.00F);

        fulano.realizarDeposito(123.00f);
        fulano.realizarSaque(300.00f);

        //não é possível acessar e alterar pois é privado
        //fulano.nome = "teste";
        //System.out.print(fulano.nome);
    }
}
