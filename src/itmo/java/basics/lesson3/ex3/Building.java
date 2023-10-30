package itmo.java.basics.lesson3.ex3;

import java.time.Year;
import java.util.Scanner;

public class Building {
    private String name;
    private short numOfFloors;
    private short yearConstructed;

    public void AddBuildingInfo(String name, short floors, short year) {
        this.name = name;
        this.numOfFloors = floors;
        this.yearConstructed = year;
    }

    public void FillBuildingInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите тип постройки: ");
        name = scanner.nextLine();
        System.out.print("Введите количество этажей: ");
        numOfFloors = scanner.nextShort();
        if (numOfFloors < 1 || numOfFloors > 240) {
            System.out.print("Неверно введён год постройки");
            System.exit(0);
        }
        System.out.print("Введите год постройки: ");
        yearConstructed = scanner.nextShort();
        if (yearConstructed < 1500 || yearConstructed > Year.now().getValue()) {
            System.out.print("Неверно введён год постройки");
            System.exit(0);
        }
    }

    public void DisplayInfo() {
        System.out.printf("Название строения - %s, количество этажей - %d, год постройки - %d, зданию "
                + BuildingAge() + " лет\n", name, numOfFloors, yearConstructed);
    }

    private short BuildingAge() {
        return (short) ((short) Year.now().getValue() - yearConstructed);
    }
}
