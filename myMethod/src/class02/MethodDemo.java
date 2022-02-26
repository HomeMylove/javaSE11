package class02;

public class MethodDemo {
    public static void main(String[] args) {
        getMax(10,20);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println("The bigger is a " + a);
        } else {
            System.out.println("The bigger is b " + b);
        }
    }

}
