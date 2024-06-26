package class01;

// 字符串拼接
public class StringBuilderTest01 {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {1, 2, 3};

        System.out.println(arrayToString(arr));

    }


    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
