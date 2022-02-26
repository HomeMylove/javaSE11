package class01;

/*
ArrayList常用方法：
    pubLic boolean remove(Object o)：删除指定的元素，返回删除是否成功
    public E remove(int index)：删除指定索引处的元素，返回被删除的元素
    public E set(int index,E element）：修改指定索引处的元素，返回被修改的元素
    public E get(int index)：返回指定索引处的元素
    pubLic int size()：返回集合中的元素的个数
 */

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("Hello");
        array.add("World");
        array.add("Java");
        array.add("python");

        System.out.println("Array01"+array);

        array.remove("Hello");

        System.out.println("Array02"+array);

        array.remove(0);

        System.out.println("Array03"+array);

        array.set(1,"JavaScript");

        System.out.println("Array03"+array);

        System.out.println("index 1 "+array.get(1));

        System.out.println("Size "+array.size());

    }
}
