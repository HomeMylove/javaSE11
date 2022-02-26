package class02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest02 {
    public static void main(String[] args) {


        ArrayList<Student> array = new ArrayList<>();

        addStudent(array);
        addStudent(array);
        addStudent(array);




        for(int i=0;i<array.size();i++){
            Student s = array.get(i);

            System.out.println("Name: "+s.getName()+" Age: "+s.getAge());

        }

    }

    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        System.out.println("输入学生的姓名:");
        String name = sc.nextLine();

        System.out.println("输入学生的年龄:");
        int age = sc.nextInt();

        Student s = new Student(name, age);

        array.add(s);
    }
}
