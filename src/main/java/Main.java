
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean truth = false;
        String text = "I am a Text";
        char charType = 'a';

        byte byteType = 8; // -128 to 127
        short shortType = 8; // -32,768 to 32,767
        int intType = 8; // -2,147,483,648 to 2,147,483,647
        long longType = 8; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        double doubleType = 0.3;
        float floatType = 0.3f;

        System.out.println(!truth);
        System.out.println(text + ", " + truth);
        System.out.println(floatType + floatType + floatType);
        System.out.println(doubleType + doubleType + doubleType);

        if (truth) {
            System.out.println("truth is true");
        } else {
            System.out.println("truth is false");
        }


        String[] names = new String[5];

        names[0] = "pii";
        names[1] = "pa";
        names[3] = "puh";

        System.out.println(Arrays.toString(names));

        int[] numbers = new int[3];
        numbers[0] = 13;
        numbers[1] = 79;
        numbers[2] = 53;

        System.out.println(numbers.length);
        System.out.println(numbers[0] + numbers[2]);

        System.out.println("adding number is " +  add(11, 23));

        String textToCheck = "so much fancyness is sooooo cool";
        System.out.println(checkLenght(textToCheck));
        System.out.println(checkFancyness(textToCheck));
    }

    public static int add ( int a, int b){
        return a + b;
    }

    static boolean checkLenght (String text) {
        return  text.contains("fancy");
    }
    static boolean checkFancyness (String text) {
        return  text.contains("fancy");
    }
}
