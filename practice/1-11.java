package practice;

import java.util.Scanner;

class mondai11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("年：");
        String a = stdIn.next();

        System.out.print("月：");
        String b = stdIn.next();

        System.out.print("日：");
        String c = stdIn.next();

        System.out.print( a +"/");
        System.out.print( b +"/");
        System.out.print( c );
    }
}