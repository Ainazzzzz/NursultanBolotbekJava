import java.util.Arrays;

public class lab3Num9 {
    public static int[] removeDuplicates(int[] nums) {
        Arrays.sort(nums);
     int addIndex = 1;
     int [] newArr=new int[nums.length];
     newArr[0]=nums[0];
        for(int i = 0; i < nums.length-1; i++) {

            if(nums[i] < nums[i + 1]){ //if true num[i + 1] is a new unique number
                newArr[addIndex] = nums[i + 1];
                addIndex++;

          }
        }

        return newArr;
    }
    public static void main(String[] args) {
         int [] array = {4,5,7,9,7,5,3,12,12,12,11};
        System.out.println(  Arrays.toString(removeDuplicates(array)));
        }

}
