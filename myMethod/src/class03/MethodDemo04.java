package class03;

public class MethodDemo04 {
    public static void main(String[] args) {

        int[] arr = {112, 2, 34, 5, 675, 23};

        System.out.println(getMax(arr));
    }


    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }
}
