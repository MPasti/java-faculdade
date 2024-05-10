package unifacef.edu.projetoprimevideo.model.dto;

public class FilmDTO {
    private long id;
    private String nome;
    private int anoLancamento;
    private float nota;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public FilmDTO(long id, String nome, int anoLancamento, float nota) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.nota = nota;

    }
}

