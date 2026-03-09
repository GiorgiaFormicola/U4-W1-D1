import java.util.Arrays;

public class Exercise1 {

    static int multiply(int number1, int number2) {
        return number1*number2;
    };

    static String concat(String string, int number) {
        return string + number;
    }

    static String[] insertInArray (String[] initialArray, String stringToAdd ) {
        if (initialArray.length==5) {
            return new String[]{initialArray[0], initialArray[1], stringToAdd, initialArray[2], initialArray[3], initialArray[4]};
        } else {
            return new String[]{"The initial array is not an array of five elements"};
        }
    };

    public static void main(String[] args) {
        System.out.println("---------- EXERCISE 1 ----------");

        System.out.println("--- MULTIPLY METHOD TEST");
        int number1 = 3;
        int number2 = 6;
        System.out.println(number1 + " x " + number2 + " = " + multiply(number1, number2));

        number1 = 4;
        number2 = 5;
        System.out.println(number1 + " x " + number2 + " = " + multiply(number1, number2));


        System.out.println("--- CONCAT METHOD TEST");
        String string = "Hello";
        int number = 10;
        System.out.println(string + " string concatenated with number " + number + " = " +concat(string, number));

        string = "5";
        number = 20;
        System.out.println(string + " string concatenated with number " + number + " = " +concat(string, number));

        System.out.println("--- INSERT IN ARRAY METHOD TEST");

        String [] initialArray = {"Yellow", "Green", "Blue", "Black", "White"};
        String stringToAdd = "Red";
        System.out.println("Initial array = " + Arrays.toString(initialArray));
        System.out.println("String to add = " + stringToAdd);
        System.out.println("Final array = " + Arrays.toString(insertInArray(initialArray, stringToAdd)));

        initialArray = new String[]{"Yellow", "Green", "Blue", "Black"};
        stringToAdd = "Red";
        System.out.println("Initial array = " + Arrays.toString(initialArray));
        System.out.println("String to add = " + stringToAdd);
        System.out.println("Final array = " + Arrays.toString(insertInArray(initialArray, stringToAdd)));

    }


}
