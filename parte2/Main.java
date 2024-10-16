package parte2;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.acelerar();
        car.frear();

        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();
        moto.bater();
    }
}