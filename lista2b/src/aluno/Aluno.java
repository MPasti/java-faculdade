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
        if (String.valueOf(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("O número do aluno deve ter 6 digitos");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade do aluno não pode ser menor que 0");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("O nome do aluno não pode passar 30 caracteres");
        }
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("A nota da P1 não pode ser negativa");
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("A nota da P2 não pode ser negativa");
        }
    }

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void notaFinal() {
        float media = (this.p1 + this.p2) / 2;
        System.out.println("Média Final: " + media);
    }
    public void dadosAluno() {
        System.out.println("Número do Aluno: " + this.numeroAluno +
                "\nNome: " + this.nome + "\nIdade: " + this.idade);
    }
}
