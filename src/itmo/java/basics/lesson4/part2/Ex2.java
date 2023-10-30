package itmo.java.basics.lesson4.part2;

import java.util.Scanner;

public class Ex2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        if (length < 1) {
            System.out.print("Неверная длина массива!");
            System.exit(0);
        } else {
            System.out.println("Введите числа массива: ");
            createAndPrintArray(length);
        }
    }

    private static void createAndPrintArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Result: [ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
