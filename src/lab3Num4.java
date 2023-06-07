public class lab3Num4 {
    public static void minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }

    public static void main(String[] args) {
        int[] arr = {5,9,3,1,6,9,4};
        minMax(arr);
    }
}
