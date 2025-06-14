public class ArrayReverseExampleWithMethod {

    public static void reverseArrayElements(int a[], int n){
        int[] b = new int[n];
        int j = n;
        for(int i = 0; i < n; i++){
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("");
        for(int k = 0; k < n; k++){
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverseArrayElements(arr, arr.length);
    }
}
