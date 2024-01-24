package practice;

 class mondai24 {
   // 「Hello」を指定回数表示する関数（メソッド）
   public static void printHelloMultipleTimes(int times) {
       for (int i = 0; i < times; i++) {
           System.out.println("Hello");
       }
   }
   public static void main(String[] args) {
       // 関数を呼び出して「Hello」を10回表示する
       printHelloMultipleTimes(10);
   }
}