package itmo.java.basics.lesson6.ex5;

import java.time.Year;
import java.util.Scanner;

public class Parent {

    protected int age;
    Scanner scanner = new Scanner(System.in);

    protected void getInfo() {
        System.out.println("Введите год своего рождения: ");
        age = Year.now().getValue() - scanner.nextInt();
    }

}
