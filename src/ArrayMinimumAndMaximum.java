public class ArrayMinimumAndMaximum {
    public static void main(String[] args) {
        //int[] arr = {12, 23, 543, 45, 1000, 124, 53, 75};
        int[] arr = {1, 2, 3, 4, 5};

        int minVal = findMinimumValue(arr);
        System.out.println("The minimum value in the array is: " + minVal);

        int maxVal = findMaximumValue(arr);
        System.out.println("The maximum value in the array is: " + maxVal);
    }


    public static int findMinimumValue(int[] arr){
        int minimumValue = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] < minimumValue){
                minimumValue = arr[i];
            }
        }
        return minimumValue;
    }

    public static int findMaximumValue(int[] arr){
        int maximumValue = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] > maximumValue){
                maximumValue = arr[i];
            }
        }
        return maximumValue;
    }
}
