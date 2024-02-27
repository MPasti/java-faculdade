public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world! ");

        Carro carroMatheus = new Carro("Matheus", "Subaru", "Impreza", "Preto", 2010, false, 100000);
        Carro carroRafael = new Carro("Rafael Davanço", "Mazda", "Miata", "Vermelho", 2005, false, 40000);


        carroMatheus.fichaTecnica();
        carroMatheus.ligar();
        carroMatheus.acelerar();
        carroRafael.fichaTecnica();
        carroRafael.ligar();
        carroRafael.acelerar();
    }
}