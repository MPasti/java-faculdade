public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(1, 18, "Matheus", 10, 8);
        System.out.print("bem-vindo " + aluno1.nome + "\nSua nota final é: " + aluno1.notaFinal());
        aluno1.passou();
    }
}