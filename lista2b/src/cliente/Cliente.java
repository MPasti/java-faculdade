package cliente;

public class Cliente {

    private String numeroConta, numeroAgencia, nome;

    private float saldoConta;

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldoConta() {
        return this.saldoConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8 && numeroConta.indexOf('-') == 6) {
            this.numeroConta = numeroConta;
        } else {
            System.out.print("O número da conta deve ser igual a 8");
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6 && numeroAgencia.indexOf('-') == 4){
            this.numeroAgencia = numeroAgencia;
        }else{
            System.out.print("O número da agência deve ser igual a 6");
        }
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }else{
            System.out.print("O nome da conta não pode ser maior que 30");
        }
    }

    public void setSaldoConta(float saldoConta) {
        if(saldoConta >= 0){
            this.saldoConta = saldoConta;
        }else{
            System.out.print("O saldo da conta não pode ser negativo!");
        }
    }

    public void realizarDeposito(float deposito){

        this.setSaldoConta(this.saldoConta + deposito);
    }

    //o setter já faz essa verificação do valor para a gente, não precisamos de outra condição
    public void realizarSaque(float saque){
        this.setSaldoConta(this.saldoConta - saque);
    }

    public void dadosConta(){
        System.out.print("Número da conta: "+ this.numeroConta + "\nNúmero da Agência: " + this.numeroAgencia
                + "\nNome do Cliente: " + this.nome + "\nSaldo atual: " + this.saldoConta);
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldoConta) {
        this.setNumeroAgencia(numeroAgencia);
        this.setNumeroConta(numeroConta);
        this.setNome(nome);
        this.setSaldoConta(saldoConta);
    }
}
