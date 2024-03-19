package rh;

public class Diretor extends Funcionario {

    private float acoes;
    public Diretor (){

    }

    public Diretor (String nome, String endereco, String cpf, float salario, float acoes){
        super(nome, endereco, cpf, salario);
        this.acoes = acoes;
    }

    public float getAcoes() {
        return acoes;
    }

    public void setAcoes(float acoes) {
        this.acoes = acoes;
    }

    public String toString() {
        return "Diretor{" +
                super.toString() + "acoes=" + acoes +
                '}';
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + (this.getAcoes() * 2)/12;
    }
}
