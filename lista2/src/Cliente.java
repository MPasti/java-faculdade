public class Cliente {
    int numeroConta, numeroAgencia;
    String nome;
    float saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(){

    }

    public void realizarSaque(){

    }

    public void dadosCliente(){
        System.out.print("Numero da Conta: " + this.numeroConta
                + "\nNumero da agência: " + this.numeroConta
                + "\nSaldo: " + this.saldo);
    }

}
