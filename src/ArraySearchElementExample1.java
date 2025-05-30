import java.util.Scanner;

public class ArraySearchElementExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};
        System.out.println("Enter the search element you want:");
        int searchElement = scanner.nextInt();
        boolean status = false;   // not found  true - found

        for(int i = 0; i < a.length; i++){
            if(a[i] == searchElement){
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if(status == false){
            System.out.println("Element not found");
        }
    }
}
