package class03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("1", "甘雨", "28", "璃月");
        Student s2 = new Student("2", "心海", "600", "海祇岛");

        array.add(s1);
        array.add(s2);

        while (true) {
            System.out.println("--------欢迎来到学生信息管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生:");
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("退出");
                    System.exit(0);
            }

        }
    }

    public static void addStudent(ArrayList<Student> array) {
        //建盘录入学生对象所需要的数据,显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);

        String sid;

        while (true) {
            System.out.println("输入学生学号:");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("该学号已被使用");
            } else {
                break;
            }
        }

        System.out.println("输入学生姓名:");
        String name = sc.nextLine();

        System.out.println("输入学生年龄:");
        String age = sc.nextLine();

        System.out.println("输入学生地址:");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student student = new Student(sid, name, age, address);

        //将学生对象添加到集合中
        array.add(student);

        //给出添加成功提示
        System.out.println("学生" + name + "添加成功");
    }


    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("没有数据,请先添加信息");
            return;
        }

        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入要删除的学生学号:");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);

            if (s.getSid().equals(sid)) {
                String name = s.getName();

                array.remove(s);
                System.out.println("删除学生" + name + "成功");

                return;
            }

        }


        System.out.println("学号错误");

    }

    // 判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);

            if (s.getSid().equals(sid)) {
                flag = true;
            }
        }

        return flag;

    }

}
