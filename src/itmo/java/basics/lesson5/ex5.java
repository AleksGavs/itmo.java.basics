package itmo.java.basics.lesson5;

public class ex5 {
    public static void main(String[] args) {
        String originalString = "This is a test string";

        reverseWords(originalString);
    }

    public static void reverseWords(String originalString) {
        System.out.println("The given string is: " + originalString + "\nThe string reversed word by word is:");
        String[] words = originalString.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord);
            result.append(" ");
        }
        System.out.println(result);
    }
}
