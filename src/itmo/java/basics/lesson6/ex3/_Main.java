package itmo.java.basics.lesson6.ex3;

public class _Main {
    public static void main(String[] args) {
    Car lada = new Car(1200, "Vesta", 'c', 220);
    Truck gazelle = new Truck(2000, "Next", 'б', 180, 2800, 3);

    lada.outPut();
    gazelle.outPut();
    gazelle.newWheels(4);
    }
}
