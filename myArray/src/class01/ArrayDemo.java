package class01;

// 动态初始化
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];

        System.out.println(arr);  //[I@3ac3fd8b
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        int[] arr2 = arr;

        arr2[1] = 100;

        arr2[2] = 200;

        System.out.println(arr2);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
