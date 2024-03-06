package aluno;

public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    public int getNumeroAluno() {
        return this.numeroAluno;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
}
