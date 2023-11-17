package itmo.java.basics.lesson9.ex1;

import java.util.ArrayList;
import java.util.List;

import static itmo.java.basics.lesson9.ex1.Function.getListOfLines;

public class _Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(getListOfLines("src/itmo/java/basics/lesson9/SourceFile.txt"));

        for (String line : list){
            System.out.println(line);
        }
    }
}
