package itmo.java.basics.lesson8.ex2;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class Function {
    public static ArrayList<Object> arrayList(String anyWord, int size) {
        ArrayList<Object> result = new ArrayList<>(size);
        anyWord = anyWord.toLowerCase();
        int i = 0;
        switch (anyWord) {
            case ("boolean"):
                while (i < size) {
                    result.add(i, Math.random() < 0.5);
                    i++;
                }
                break;
            case ("integer"):
                while (i < size) {
                    result.add(i, (int) ((Math.random() * (size - 1)) + size));
                    i++;
                }
                break;
            case ("float"):
                while (i < size) {
                    result.add(i, (float) ((Math.random() * (size - 1)) + size));
                    i++;
                }
                break;
            case ("string"):
                Scanner in = new Scanner(System.in);
                System.out.print("Введите длину строки: ");
                int num = in.nextInt();
                while (i < size) {
                    result.add(i, generateString(num));
                    i++;
                }
                break;
            default:
                System.out.println("Неизвестный тип данных!");
                break;
        }
        return result;
    }

    public static LinkedList<Object> linkedList(String anyWord, int size) {
        LinkedList<Object> result = new LinkedList<>();
        anyWord = anyWord.toLowerCase();
        int i = 0;
        switch (anyWord) {
            case ("boolean"):
                while (i < size) {
                    result.add(i, Math.random() < 0.5);
                    i++;
                }
                break;
            case ("integer"):
                while (i < size) {
                    result.add(i, (int) ((Math.random() * (size - 1)) + size));
                    i++;
                }
                break;
            case ("float"):
                while (i < size) {
                    result.add(i, (float) ((Math.random() * (size - 1)) + size));
                    i++;
                }
                break;
            case ("string"):
                Scanner in = new Scanner(System.in);
                System.out.print("Введите длину строки: ");
                int num = in.nextInt();
                while (i < size) {
                    result.add(i, generateString(num));
                    i++;
                }
                break;
            default:
                System.out.println("Неизвестный тип данных!");
                break;
        }
        return result;
    }
    static String generateString(int length){
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = 97 + (int)
                    (random.nextFloat() * (122 - 97 + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

   static <T> void getElementsFromArrayList(ArrayList<T> list, int iterationNum){
       Random random = new Random();
       for (int i = 0; i < iterationNum; i++){
           int r = random.nextInt(1000000);
           list.get(r);
        }
   }

    static  <T> void getElementsFromLinkedList(LinkedList<T> list, int iterationNum){
        Random random = new Random();
        for (int i = 0; i < iterationNum; i++){
            int r = random.nextInt(1000000);
            list.get(r);
        }
    }

}
