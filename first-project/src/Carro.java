public class Carro {
    public String dono, marca, modelo, cor;
    public int ano;
    public boolean motor;
    public float precoAtual;
    // construtor para instanciar o objeto

    public Carro(String dono, String marca, String modelo, String cor, int ano, boolean motor, float precoAtual){
        this.dono = dono;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.precoAtual = precoAtual;
    }

    public void fichaTecnica(){
        System.out.println("\nDono: " + this.dono+ "\nMarca: " + this.marca
                + "\nModelo: " + this.modelo + "\nCor: "
                + this.cor + "\nAno: " + this.ano + "\nMotor: "
                + this.motor + "\nPreço Atual: "+ this.precoAtual);
    }

    public void desligar(){
        if(this.motor){
            this.motor = false;
        }
    }

    public void ligar(){
        if(!this.motor){
            this.motor = true;
        }
    }

    public void acelerar(){
        if(this.motor){
            this.som();
        }
    }

    public void som(){
        System.out.print("VRUMMMMMMMMMMMMMMMMMM 🚗🚗🚗🚗🚗");
    }
}
