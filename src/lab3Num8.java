import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lab3Num8 {
    public static int binarySearch(int target,int ... arr){
        int right=arr.length-1;
        int left=0;
        for (int i = 0; i < right; i++) {
            int middle = (left+right)/2;
            if(target<arr[middle]){
               right = middle-1;
            } else if(target>arr[middle]){
                left = middle+1;

            }else if(target==arr[middle]) {
                return middle;
            }
        }
        return 0;
    }
    public static int linearSearch(int target,int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return i;
            }

        }
    return 0;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        Random rn= new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=rn.nextInt(1,35);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        // methods return index of target number if it is included into an array
        // if there is no such a number then will be returned zero - 0
        System.out.println(binarySearch(34,array));
        System.out.println(linearSearch(34,array));
    }
}
