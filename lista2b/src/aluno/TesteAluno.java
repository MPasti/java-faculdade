package aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123456, 18, "Fulano", 8.5f, 8.0f);
        Aluno aluno2 = new Aluno(123545, 18, "Robertinho", 0f, 1f);
        aluno2.setNumeroAluno(987654);
        aluno2.setNome("Fulano de Tal");
        aluno2.setIdade(20);
        aluno2.setP1(8.5f);
        aluno2.setP2(7.0f);

        aluno1.notaFinal();
        aluno1.dadosAluno();
        aluno2.notaFinal();
        aluno2.dadosAluno();
    }
}
