package itmo.java.basics.lesson9.ex2;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Function {
    public static void printStringIntoFile(ArrayList<String> content, String fileName) {
        Path out = Paths.get(fileName);
        try {
            Files.write(out,content, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printStringIntoFile(String content, String fileName) {
        Path out = Paths.get(fileName);
        try {
            Files.write(out,content.getBytes(Charset.defaultCharset()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
