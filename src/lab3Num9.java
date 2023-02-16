import java.util.Arrays;

public class lab3Num9 {
    public static int [] removeDuplicates(int [] arr){
        Arrays.sort(arr);
        int h=0;
        int [] arr1= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]!=arr[j]){
                    arr1[h++]=arr[i];

                }

            }

        }
   return arr1; }

    public static void main(String[] args) {
        int [] arr={4,6,5,3,2,4,6,6,3};
     int [] arr1= removeDuplicates(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]+" ");

        }
    }
}
