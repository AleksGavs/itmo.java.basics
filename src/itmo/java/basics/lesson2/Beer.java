package itmo.java.basics.lesson2;

public class Beer {
    private int beerId;
    private String name;
    private Type type;
    private float strength;
    private Country contryOfOrigin;
    private double price;
    private boolean isOnStock;
    private int bottlesInBox;

    public Beer() {

    }

    public Beer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Beer(String name, Type type, float strength, Country contryOfOrigin, double price, boolean isOnStock, int bottlesInBox) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.contryOfOrigin = contryOfOrigin;
        this.price = price;
        this.isOnStock = isOnStock;
        this.bottlesInBox = bottlesInBox;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public Country getContryOfOrigin() {
        return contryOfOrigin;
    }

    public void setContryOfOrigin(Country contryOfOrigin) {
        this.contryOfOrigin = contryOfOrigin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnStock() {
        return isOnStock;
    }

    public void setOnStock(boolean onStock) {
        isOnStock = onStock;
    }

    public int getBottlesInBox() {
        return bottlesInBox;
    }

    public void setBottlesInBox(int bottlesInBox) {
        this.bottlesInBox = bottlesInBox;
    }
}
