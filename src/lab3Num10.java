import java.util.Arrays;

public class lab3Num10 {
    //TODO Write a program to find all pairs of elements
    // in the array that sum to a specific target value
    public static void elementsPairs(int [] arr,int target){ // O(N^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(Arrays.toString(new int[]{i,j})); // prints out indexes of needed elems
                }

            }

        }
    }
    public static void main(String[] args) {
        int [] array= {1,5,9,7,6,4,2,3,5};
        elementsPairs(array,6);
    }
}
