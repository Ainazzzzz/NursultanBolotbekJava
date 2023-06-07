import java.util.Arrays;

public class lab3Num5 {
   public static void ascending(int [] arr){
       for (int i = 0; i < arr.length; i++) {
           for (int j = i; j < arr.length; j++) {
               if (arr[i] >= arr[j]) {
                   int third = arr[i];
                   arr[i] = arr[j];
                   arr[j] = third;
               }
               }
           }
       System.out.println(Arrays.toString(arr));
   }

    public static void descending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j =i ; j<arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    int third = arr[i];
                    arr[i] = arr[j];
                    arr[j] = third;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {

       int [] arr = {3,4,7,5,3,1,3,6};
       ascending(arr);
       descending(arr);
    }
}
