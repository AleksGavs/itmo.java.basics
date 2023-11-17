package itmo.java.basics.lesson9.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Function {
    public static List<String> getListOfLines(String path) {
        List<String> res = new ArrayList<>();
        try {
            List<String> allLines = Files.readAllLines(Paths.get(path));
            res.addAll(allLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
