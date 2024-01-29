package practice;

import java.util.Scanner;

class Mondai34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 整数1の入力
            System.out.print("整数1 = ");
            int num1 = scanner.nextInt();

            // 整数2の入力
            System.out.print("整数2 = ");
            int num2 = scanner.nextInt();

            // 割り算
            double result = divide(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            // 除算例外の処理
            System.out.println("0による割り算です!!");
        } finally {
            System.out.println("処理終了");
            scanner.close();
        }
    }

    private static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0除算例外");
        }
        return (double) num1 / num2;
    }
}
