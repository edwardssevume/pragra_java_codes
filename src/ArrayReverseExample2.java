import java.util.Scanner;

public class ArrayReverseExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array you want:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("============Before Reversing===========");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("============After Reversing===========");

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        ArrayReverseExampleWithMethod.reverseArrayElements(arr, arr.length);
    }
}
