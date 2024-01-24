package practice;

import java.util.Scanner;

class mondai10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字の入力：");
        String a = stdIn.next();

        System.out.print("整数の入力：");
        String b = stdIn.next();

        System.out.print("小数の入力：");
        String c = stdIn.next();

        System.out.println("入力された文字=" + a );
        System.out.println("入力された整数=" + b );
        System.out.println("入力された小数=" + c );
    }
}