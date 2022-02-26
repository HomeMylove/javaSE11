package class01;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("甘雨");

        array.add("心海");

        array.add("八重");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }


    }
}
