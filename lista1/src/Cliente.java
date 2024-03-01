public class Cliente {

    int numeroConta, numeroAgencia;
    String nome;
    double saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Novo saldo: R$ " + this.saldo);
    }

    public void realizarSaque(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Novo saldo: R$ " + this.saldo);
        }
    }

    public String obterInformacoesConta() {
        return "Número da conta: " + this.numeroConta + "\nNome do cliente: "+ this.nome +"\nNumero Agencia: "+ this.numeroAgencia  + "\nSaldo atual: R$ " + this.saldo;
    }
}
