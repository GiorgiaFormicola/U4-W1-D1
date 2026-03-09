import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise3 {
    static double rectanglePerimeter(double base, double height) {
        return new BigDecimal(base * height).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("---------- EXERCISE 2 ----------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- RECTANGLE PERIMETER METHOD TEST");
        System.out.println("Insert the length of the rectangle base in centimeters");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert the length of the rectangle height in centimeters");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter(base, height) + " cm long");
    }
}
