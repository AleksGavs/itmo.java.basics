package itmo.java.basics.lesson9.ex4;

import java.util.ArrayList;

import static itmo.java.basics.lesson9.ex1.Function.getListOfLines;
import static itmo.java.basics.lesson9.ex2.Function.printStringIntoFile;

public class Function {

    public static void replaceWith$ (String path){
        ArrayList<String> list = new ArrayList<>(getListOfLines(path));
        ArrayList<String> newList = new ArrayList<>();
        for (String line : list){
            String changed = line.replaceAll("[^\\D && a-zA-Zа-яёА-ЯЁ]", "\\$");
            newList.add(changed);
        }
        for (String line : newList){
            System.out.println(line);
        }
        printStringIntoFile(newList, path);//тут ошибка: пишет, что файл не найден, хотя в первом методе открывает его
        //Если путь задать другой, то всё ок.
    }
}
