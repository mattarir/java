package practice;

class mondai25 {
   // 指定された文字列を指定された回数分表示する関数（メソッド）
   public static void printStringMultipleTimes(String str, int times) {
       for (int i = 0; i < times; i++) {
           System.out.println(str);
       }
   }
   public static void main(String[] args) {
       // 関数を利用して実行結果を得る
       printStringMultipleTimes("Hello", 3);
       printStringMultipleTimes("Good morning", 4);
       printStringMultipleTimes("Good evening", 2);
   }
}   
