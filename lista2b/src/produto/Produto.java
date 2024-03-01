package produto;

public class Produto {

        private int codigo;
        public int qtd;
        private float nota;
    public void setCodigo(int codigo){
        if (codigo > 0) this.codigo = codigo;
        else System.out.println("Codigo inválido!");
    }

    public int getCodigo(){
        return this.codigo;
    }

    public float getNota(){
        return this.nota;
    }
}
