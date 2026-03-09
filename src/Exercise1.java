public class Exercise1 {

    static int multiply(int number1, int number2) {
        return number1*number2;
    };

    public static void main(String[] args) {
        System.out.println("---------- EXERCISE 1 ----------");
        
        int number1 = 3;
        int number2 = 6;
        System.out.println(number1 + "x" + number2 + "=" + multiply(number1, number2));

        number1 = 4;
        number2 = 5;
        System.out.println(number1 + "x" + number2 + "=" + multiply(number1, number2));
    }


}
