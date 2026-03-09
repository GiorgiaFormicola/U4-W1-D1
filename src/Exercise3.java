import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise3 {
    static double rectanglePerimeter(double base, double height) {
        return new BigDecimal(base * height).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    static int evenOrUneven(int number) {
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("---------- EXERCISE 2 ----------");
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("--- RECTANGLE PERIMETER METHOD TEST");
        System.out.println("Insert the length of the rectangle base in centimeters");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert the length of the rectangle height in centimeters");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter(base, height) + " cm long");*/

        System.out.println("--- EVEN OR UNEVEN METHOD TEST");
        System.out.println("Insert a number");
        int number = Integer.parseInt(scanner.nextLine());
        int evenOrUnevenResult = evenOrUneven(number);
        if (evenOrUnevenResult == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is uneven");
        }
    }
}
