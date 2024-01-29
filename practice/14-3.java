package practice;

import java.util.Scanner;

class Mondai36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーに文字列の入力を促す
        System.out.print("文字列を入力：");
        // ユーザーが入力した文字列を取得
        String inputString = scanner.nextLine();

        // 結果の文字列を生成
        String resultString = manipulateString(inputString);

        // 結果の文字列を画面に表示
        System.out.println("結果文字列：" + resultString);
    }

    private static String manipulateString(String inputString) {
        // 文字列の長さが11以上の場合、11文字以降を削除
        if (inputString.length() >= 11) {
            StringBuilder stringBuilder = new StringBuilder(inputString);
            stringBuilder.setLength(10); // 11文字以降を削除
            return stringBuilder.toString();
        }
        // 文字列の長さが10文字以下はそのまま返す
        return inputString;
    }
}
