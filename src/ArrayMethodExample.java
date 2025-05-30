public class ArrayMethodExample {

    public static int arrMethod(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 543, 45, 1000, 124, 53, 75};
        int result = arrMethod(arr);
        System.out.println(result);



    }
}
