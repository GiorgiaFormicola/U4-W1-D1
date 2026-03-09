import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise3 {
    static double rectanglePerimeter(double base, double height) {
        return new BigDecimal(base * height).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    ;

    static int evenOrUneven(int number) {
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    ;

    static double triangleArea(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return new BigDecimal(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3))).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    ;

    public static void main(String[] args) {
        System.out.println("---------- EXERCISE 3 ----------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- RECTANGLE PERIMETER METHOD TEST");
        System.out.println("Insert the length of the rectangle base in centimeters");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert the length of the rectangle height in centimeters");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter(base, height) + " cm long");

        System.out.println("--- EVEN OR UNEVEN METHOD TEST");
        System.out.println("Insert a number");
        int number = Integer.parseInt(scanner.nextLine());
        int evenOrUnevenResult = evenOrUneven(number);
        if (evenOrUnevenResult == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is uneven");
        }

        System.out.println("--- TRIANGLE AREA METHOD TEST");
        System.out.println("Insert the length in centimeters of the triangle first side");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert the length in centimeters of the triangle second side");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert the length in centimeters of the triangle third side");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.println("The chosen triangle has an area of " + triangleArea(side1, side2, side3) + " cm²");

    }
}
