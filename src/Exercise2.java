import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println("---------- EXERCISE 2 ----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first string to concatenate");
        String string1 = scanner.nextLine();
        System.out.println("Insert the second string to concatenate");
        String string2 = scanner.nextLine();
        System.out.println("Insert the third string to concatenate");
        String string3 = scanner.nextLine();
        System.out.println("Strings concatenated following the insertion order: " + string1 + string2 + string3);
        System.out.println("Strings concatenated following the reverse of the insertion order: " + string3 + string2 + string1);
    }
}
