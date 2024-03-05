public class TestaRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio("Rio Negro", 10.5, false);
        Rio rio2 = new Rio("Rio Solimões", 35.0, true);

        rio1.chover(2.5);
        rio1.ensolarar(1.0);

        rio2.chover(5.0);
        rio2.ensolarar(4.0);

        rio1.sujar();

        rio2.limpar();

        System.out.println("Informações do Rio 1:");
        rio1.mostra();

        System.out.println();

        System.out.println("Informações do Rio 2:");
        rio2.mostra();
    }
}