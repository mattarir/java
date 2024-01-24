package practice;

class mondai18 {
   public static void main(String[] args) {
       // 九九の式の表示
       for (int i = 1; i <= 9; i++) {
           System.out.println(i + " の段");
           for (int j = 1; j <= 9; j++) {
               System.out.println(i + "x" + j + "=" + (i * j));
           }
           System.out.println(); // 段ごとに改行
       }
   }
}