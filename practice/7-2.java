package practice;

 class mondai21 {
    static void main(String[] args) {
       // 合計を格納する変数
       int sum = 0;
       // カウンタ変数
       int i = 1;
       // 1から100までの整数値を合計に加える
       do {
           sum += i;
           i++;
       } while (i <= 100);
       // 合計の表示
       System.out.println("合計: " + sum);
   }
}