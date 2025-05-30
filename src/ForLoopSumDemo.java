import java.util.Scanner;

public class ForLoopSumDemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the limit of your choice:");
        int limit = obj.nextInt();
        int sum = 0;

        for(int initialValue = 1; initialValue <= limit; initialValue ++){
            System.out.println(initialValue);
            sum = sum + initialValue;
        }
        System.out.println("The sum of the above numbers is:" + " " + sum);
    }
}
