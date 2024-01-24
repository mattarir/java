package practice;

import java.util.Scanner;
 class mondai22 {
   public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in);
       // 整数値の入力
       System.out.print("整数値を入力: ");
       int number = stdIn.nextInt();
       // 反転された桁を格納する変数
       int reversedNumber = 0;
       // 桁を反転する処理
       do {
           int digit = number % 10;  // 末尾の桁を取得
           reversedNumber = reversedNumber * 10 + digit;
           number /= 10;  // 末尾の桁を削除
       } while (number != 0);
       // 反転した結果の表示
       System.out.println("反転結果: " + reversedNumber);
   }
}