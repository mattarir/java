package test13_3;

class Mondai13_2 {
    public static void main(String[] args) {
        // Teacherクラスのインスタンス生成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        // Teacherクラスのintroduceメソッドを呼び出し
        teacher.introduce();

        System.out.println(); // 改行

        // Cookクラスのインスタンス生成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        // Cookクラスのintroduceメソッドを呼び出し
        cook.introduce();
    }
}
