package class03;

public class MethodDemo03 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length;i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i]+", ");
            }
        }
    }


}
