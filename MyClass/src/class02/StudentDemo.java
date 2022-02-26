package class02;

public class StudentDemo {
    public static void main(String[] args) {
        Student p = new Student();

        System.out.println(p.getAge());

        p.setAge(100);

        System.out.println(p.getAge());


        p.setAge(300);
    }
}
