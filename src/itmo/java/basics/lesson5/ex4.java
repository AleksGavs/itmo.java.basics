package itmo.java.basics.lesson5;

public class ex4 {

    public static void main(String[] args) {
        String text = "Овощи очень полезны, потому что в них ул а (1) много витаминов. Например, в моркови есть витамин А, " +
                "который помогает детям расти и укрепляет зрение. В сладком у ла перце есть витамин С, который оберегает детей от " +
                "простуды. У человека, который съел мясо, прибывают силы, потому что в мясе много белка. Ул а (2), горох и фасоль называют" +
                " растительным мясом — они тоже богаты белком." +

                "\nЧеснок и лук убивают вредных бактерий и помогают нам бороться с болезнями." +

                "\nПомидоры и ул а (3) огурцы можно встретить в любом доме, в них простодляпроверкичтобыудобней тоже много витаминов. Ну а картофель, конечно же, известен всем." +
                " Из него делают вкусное картофельное пюре. В картофеле ул а (4) много крахмала.";

        String subString = "ул а";

        displayNumberOfOccurances(text, subString);
    }

    public static void displayNumberOfOccurances(String text, String substring) {
        int lastIndex = 0;
        int result = 0;

        while (lastIndex != -1) {
            lastIndex = text.toLowerCase().indexOf(substring, lastIndex);
            if (lastIndex != -1) {
                result++;
                lastIndex += substring.length();
            }
        }
        System.out.println(result);
    }
}

