package practice;

class mondai23 {
   // 学校名と名前を表示する関数（メソッド）
   public static void displayInfo(String schoolName, String name) {
       System.out.println("学校名：" + schoolName);
       System.out.println("名前：" + name);
   }
   public static void main(String[] args) {
       // 引数として学校名と名前を渡して関数を呼び出す
       displayInfo("東京情報クリエイター工学院専門学校", "竹井一馬");
   }
}
