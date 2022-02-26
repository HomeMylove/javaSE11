package class01;

import java.util.Scanner;

public class StringBuilder02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一句话:");
        String line = sc.nextLine();

        String text = reverse(line);

        System.out.println("这句话倒过来是: "+text);


    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

}
