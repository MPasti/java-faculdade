package rh;

public class Assistente extends Funcionario {
    private float horaExtra;

    public Assistente() {
        super(); // chama construtor da classe Pai
    }

    public Assistente(String nome, String endereco, String cpf,
                      float salario, float horaExtra) {
        // chama construtor da classe Pai - reusabilidade de código-fonte
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    //para sobrescrever e o toString e o to string ser diferente das outras classes
    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() + "horaExtra=" + horaExtra +
                '}';
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + this.horaExtra * 50;
    }
}
