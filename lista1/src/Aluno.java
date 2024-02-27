public class Aluno {
    public int nmAluno, idade;
    public String nome;
    public float p1, p2;


    public Aluno(int nmAluno, int idade, String nome, float p1, float p2 ){

        this.nmAluno = nmAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    public void passou(){
        if(this.notaFinal() >= 6){
            System.out.println("\nPassou!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
