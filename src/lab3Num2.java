import java.util.Arrays;

public class lab3Num2 {
    public static void reverseArray(int[] arr) {

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2,3,5,7,8,5,2};
        reverseArray(arr);
    }
}
