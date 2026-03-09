public class Exercise1 {

    static int multiply(int number1, int number2) {
        return number1*number2;
    };

    static String concat(String string, int number) {
        return string + number;
    }

    public static void main(String[] args) {
        System.out.println("---------- EXERCISE 1 ----------");
        System.out.println("--- MULTIPLY METHOD TEST");
        int number1 = 3;
        int number2 = 6;
        System.out.println(number1 + "x" + number2 + "=" + multiply(number1, number2));

        number1 = 4;
        number2 = 5;
        System.out.println(number1 + "x" + number2 + "=" + multiply(number1, number2));

        System.out.println("--- CONCAT METHOD TEST");
        String string = "Hello";
        int number = 10;
        System.out.println(string + " string concatenated with number " + number + " = " +concat(string, number));

        string = "5";
        number = 20;
        System.out.println(string + " string concatenated with number " + number + " = " +concat(string, number));

    }


}
