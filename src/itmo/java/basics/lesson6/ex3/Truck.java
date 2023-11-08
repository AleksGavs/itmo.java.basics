package itmo.java.basics.lesson6.ex3;

public class Truck extends Car {
    private int wheelsQty;
    private float maxWeight;

    public int getWheelsQty() {

        return wheelsQty;
    }

    public float getMaxWeight() {

        return maxWeight;
    }

    public void newWheels(int wheelsQty) {
        this.wheelsQty = wheelsQty;
        System.out.println("Количество колёс: " + wheelsQty);
    }


    public Truck(int w, String m, char c, float s, float mw, int wh) {
        weight = w;
        model = m;
        color = c;
        speed = s;
        this.maxWeight = mw;
        this.wheelsQty = wh;
    }
}
