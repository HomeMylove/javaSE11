package class01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        // public boolean add(E e);
        array.add("Hello");

        array.add("World");

        array.add("Java");

        array.add(1,"JavaSE");

        System.out.println("array"+array);
    }
}
