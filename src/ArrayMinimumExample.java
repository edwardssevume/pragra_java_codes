public class ArrayMinimumExample {
    public static void main(String[] args) {
        int[] arr = {12, 23, 543, 45, 1000, 124, 53, 75};
        int largest = arr[0];

        for(int i = 0; i < arr.length; i ++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

    }
}
