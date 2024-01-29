package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Mondai35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 整数の入力を促す
            System.out.print("整数を入力 = ");
            int number = scanner.nextInt();

            // 入力された数が偶数か奇数かを判定
            if (isEven(number)) {
                System.out.println(number + " は偶数");
            } else {
                System.out.println(number + " は奇数");
            }
        } catch (InputMismatchException e) {
            // 入力が整数以外の場合の処理
            System.out.println("整数と認識できません！！");
        } finally {
            
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
