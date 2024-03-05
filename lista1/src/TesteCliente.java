public class TesteCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(123, 123, "Fulano", 1000.0);


        fulano.realizarDeposito(500.0);
        fulano.realizarSaque(200.0);


        System.out.println("Informações da conta de Fulano:");
        System.out.println(fulano.obterInformacoesConta());

        System.out.println();


        Cliente beltrano = new Cliente(456, 123 , "Beltrano", 2000.0);


        beltrano.realizarDeposito(1000.0);
        beltrano.realizarSaque(3000.0);


        System.out.println("Informações da conta de Beltrano:");
        System.out.println(beltrano.obterInformacoesConta());
    }
}