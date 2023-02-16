import java.util.Scanner;

public class lab3Num6 {
    public static int occurrenceOfSpecificNum(int [] array,int a){
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==a){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int nums=sc.nextInt();
            array[i]=nums;
        }
        int methodCall=occurrenceOfSpecificNum(array,3);
        System.out.println("The number of occurrences " +methodCall);


    }
}
