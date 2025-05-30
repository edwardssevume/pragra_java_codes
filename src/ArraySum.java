public class ArraySum {

    public static int findSumOfArray(int[] arr){
        int sum = 0;
        for(int value : arr){
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = findSumOfArray(array);

        System.out.println("Sum of the array elements is:" + sum);
    }
}
