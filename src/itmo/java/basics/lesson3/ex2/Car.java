package itmo.java.basics.lesson3.ex2;

public class Car {
    private String name;
    private String color;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Car() {
    }

    ;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void PrintCar() {
        System.out.printf("Название автомобиля - %s, цвет - %s, вес - %.2f кг.\n", name, color, weight);
    }
}
