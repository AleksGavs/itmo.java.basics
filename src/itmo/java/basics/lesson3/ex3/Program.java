package itmo.java.basics.lesson3.ex3;

public class Program {
    public static void main(String[] args) {
        Building house = new Building();
        house.AddBuildingInfo("Многоквартирный дом", (short) 21, (short) 2002);
        house.DisplayInfo();

        Building scyscrapper = new Building();
        scyscrapper.FillBuildingInfo();
        scyscrapper.DisplayInfo();
    }
}
