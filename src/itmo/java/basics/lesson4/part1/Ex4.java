package itmo.java.basics.lesson4.part1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int i = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int j = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int k = scanner.nextInt();
        System.out.print("Результат: " + (j > i && k > j));
    }
}
