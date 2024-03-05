public class Rio {
    private String nome;
    private double nivel;
    private boolean poluido;

    public Rio(String nome, double nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(double quantidadeChuva) {
        nivel += quantidadeChuva;
    }

    public void ensolarar(double evaporacao) {
        if (nivel >= evaporacao) {
            nivel -= evaporacao;
        } else {
            nivel = 0.0f;
        }
    }

    public void limpar() {
        poluido = false;
    }

    public void sujar() {
        poluido = true;
    }

    public void mostra() {
        System.out.println("Nome do rio: " + nome);
        System.out.println("Nível do rio: " + nivel);
        System.out.println("O rio está poluído? " + (poluido ? "Sim" : "Não"));
    }
}