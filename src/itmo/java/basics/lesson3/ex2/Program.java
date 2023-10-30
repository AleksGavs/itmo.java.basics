package itmo.java.basics.lesson3.ex2;

public class Program {
    public static void main(String[] args) {
        Car ladaGranta = new Car("красный");
        ladaGranta.setName("LADA Granta");
        ladaGranta.setWeight(2500);

        Car renaultKaptur = new Car("чёрный", 3000);
        renaultKaptur.setName("Renault Kaptur");

        ladaGranta.PrintCar();
        renaultKaptur.PrintCar();
    }
}
