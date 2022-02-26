package class02;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("甘雨",500);
        Student s2 = new Student("刻晴",20);
        Student s3 = new Student("心海",100);

        array.add(s1);
        array.add(s2);
        array.add(s3);

//        System.out.println(array);

        for(int i=0;i<array.size();i++){

            Student s = array.get(i);

            System.out.println("Name:"+s.getName()+" Age:"+s.getAge());
        }

    }
}
