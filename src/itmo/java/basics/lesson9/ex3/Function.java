package itmo.java.basics.lesson9.ex3;

import java.util.ArrayList;

import static itmo.java.basics.lesson9.ex1.Function.getListOfLines;
import static itmo.java.basics.lesson9.ex2.Function.printStringIntoFile;

public class Function {

    public static void combinationOfFunctions(String firstFile, String secondFile, String ResultFileName){
        ArrayList<String> list = new ArrayList<>(getListOfLines(firstFile));
        list.addAll(getListOfLines(secondFile));
        printStringIntoFile(list, "Result");
    }

}
