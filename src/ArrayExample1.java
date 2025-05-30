import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < arr.length; i ++){
            arr[i] = scanner.nextInt();
        }
    }
}
