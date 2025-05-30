import java.util.Scanner;

public class ArrayElementsFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements of array:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Print all the elements:");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
