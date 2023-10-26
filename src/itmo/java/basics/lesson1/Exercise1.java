package itmo.java.basics.lesson1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String args[]) {
        part1();
        part2();
        part3();
        part4();
        part5and6();
    }

    static void part1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("java.\n");
    }

    static void part2() {
        System.out.println((46 + 10) * (10 / 3));
        System.out.println((29) * (4) * (-15) + "\n");
    }

    static void part3() {
        int number = 10500;
        double result = ((double) number / 10) / 10;

        System.out.println(result + "\n");
    }

    static void part4() {
        float a = 3.6f;
        float b = 4.1f;
        float c = 5.9f;
        float result = a * b * c;

        System.out.println(result + "\n");
    }

    static void part5and6() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scan.nextInt();

        System.out.print("Введите число b: ");
        int b = scan.nextInt();
        if (b % 2 == 1) {
            System.out.println("Нечётное");
        } else if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Чётное");
        }

        System.out.print("Введите число c: ");
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c + "\n");
    }
}

