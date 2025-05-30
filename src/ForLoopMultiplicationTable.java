import java.util.Scanner;

public class ForLoopMultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplication Table: ");

        System.out.println("Please enter the multiplication you want: ");
        int multiplication = scanner.nextInt();

        System.out.println("Please enter the number to multiply: ");
        int number;

        System.out.println("Please enter the multiplication limit: ");
        int limit = scanner.nextInt();

        for (number = scanner.nextInt(); number <= limit; number ++){
            System.out.println("The multiplication of" + " " +multiplication + " X " + number + " = " + (multiplication * number));
        }

    }
}
