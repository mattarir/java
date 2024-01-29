package practice;

import java.util.Scanner;

class Mondai32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーに文字列の入力をしてもらう
        System.out.print("文字列を入力：");
        // ユーザーが入力した文字列を取得する
        String inputString = scanner.nextLine();

        // 入力された文字列を画面に表示する
        System.out.println(inputString);

    }
}
