package class01;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber(13);
    }

    public static void isEvenNumber(int number){

        System.out.println(number % 2 == 0);
    }
}
