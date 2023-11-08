package itmo.java.basics.lesson6.ex4;

import java.util.Scanner;

abstract class Parent {
    protected Integer parentNum;

    protected void initializeParentNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        parentNum = scanner.nextInt();
    }

    abstract void displayParentNum();
}
