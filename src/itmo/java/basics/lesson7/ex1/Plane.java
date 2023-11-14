package itmo.java.basics.lesson7.ex1;

public class Plane {
    public void createAndDisplayWing(int weight){
        Plane.Wing wing = new Plane.Wing();
        wing.weight = weight;
        wing.displayWeight();
    }
    public class Wing{
        int weight;
        void displayWeight(){
            System.out.printf("Вес крыла самолёта равен %d кг.\n", weight);
        }
    }
}
