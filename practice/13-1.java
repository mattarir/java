package practice;

abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getOccupation();

    public abstract void displayInfo();
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getOccupation() {
        return "教員";
    }

    public void displayInfo() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + getOccupation());
        System.out.println("担当科目：" + subject);
    }
}

class Cook extends Person {
    private String specialDish;

    public Cook(String name, String specialDish) {
        super(name);
        this.specialDish = specialDish;
    }

    public String getOccupation() {
        return "シェフ";
    }

    public void displayInfo() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + getOccupation());
        System.out.println("得意料理：" + specialDish);
    }
}

class Mondai31 {
    public static void main(String[] args) {
        // Teacherクラスのインスタンス生成
        Teacher teacher = new Teacher("竹井一馬", "情報処理");
        // TeacherクラスのdisplayInfoメソッドを呼び出し
        teacher.displayInfo();

        System.out.println(); // 改行

        // Cookクラスのインスタンス生成
        Cook cook = new Cook("大原太郎", "オムライス");
        // CookクラスのdisplayInfoメソッドを呼び出し
        cook.displayInfo();
    }
}
