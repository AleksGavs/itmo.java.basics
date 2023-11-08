package itmo.java.basics.lesson5;

public class ex2 {
    public static void main(String[] args) {
        String[] testArray = {"Топот", "потоп", "пуп", "око", "глаз", "арбуз", "наган"};

        for (String word : testArray) {
            isPalyndrom(word);
        }
    }

//    public static void isPalyndrom(String word) {
//        word = word.toLowerCase();
//        StringBuilder originalWord = new StringBuilder(word);
//        String reversedWordString = originalWord.reverse().toString();
//        System.out.println(word.equals(reversedWordString));
//    }


    public static void isPalyndrom(String word){
        word = word.toLowerCase();
        boolean isPalyndrom = false;
        char[] letterArray = word.toCharArray();
        int j = letterArray.length-1;
        for (int i = 0; i < letterArray.length / 2; i++){
            if (letterArray[i] != letterArray[j]) {
                break;
            }
            else{
                j--;
            }
            isPalyndrom = true;
        }
        System.out.println(isPalyndrom);
    }
}
