import java.util.Scanner;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of numbers:");
        int limit = scanner.nextInt();

        for(int x = 1; x <= limit; x ++){
            System.out.println(x);
        }
    }
}
