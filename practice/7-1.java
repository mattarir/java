package practice;

class mondai20 {
   public static void main(String[] args) {
       // 合計を格納する変数
       int sum = 0;
       // カウンタ変数
       int i = 1;
       // 1から100までの数字を合計に加える
       while (i <= 100) {
           sum += i;
           i++;
       }
       // 合計の表示
       System.out.println("1から100までの合計: " + sum);
   }
}