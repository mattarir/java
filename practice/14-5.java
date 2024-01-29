package practice;

class Mondai37 {
    public static void main(String[] args) {
        // 内容1の文字列
        String content1 = "東京都千代田区";

        // 内容2の文字列
        String content2 = "神田神保町";

        // 2つの文字列を結合する
        String result = concatenateStrings(content1, content2);

        // 結果の文字列を画面に表示する
        System.out.println(result);
    }

    private static String concatenateStrings(String content1, String content2) {
        // StringBuilderを使用して文字列を結合する
        StringBuilder stringBuilder = new StringBuilder(content1);
        stringBuilder.append(content2);
        return stringBuilder.toString();
    }
}
