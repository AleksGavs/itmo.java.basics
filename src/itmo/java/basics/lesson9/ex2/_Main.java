package itmo.java.basics.lesson9.ex2;

import java.util.ArrayList;
import java.util.List;

import static itmo.java.basics.lesson9.ex2.Function.printStringIntoFile;

public class _Main {
    public static void main(String[] args) {
        String stringToAdd = "Kolobok hanged himself";
        printStringIntoFile(stringToAdd, "src/itmo/java/basics/lesson9/Ex2Result.txt");
    }
}
