package class01;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "iphone";
        p.price = 8999;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
    }
}
