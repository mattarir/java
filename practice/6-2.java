package practice;

 class mondai17 {
   public static void main(String[] args) {
       // 合計を格納する変数
       int sum = 0;
       // 1から100までの数字を合計に加える
       for (int i = 1; i <= 100; i++) {
           sum += i;
       }
       // 合計の表示
       System.out.println("1から100までの合計: " + sum);
   }
}