package practice;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
    }
}

class Teacher extends Person {
    private String occupation;
    private String subject;

    public Teacher(String name, String occupation, String subject) {
        super(name);
        this.occupation = occupation;
        this.subject = subject;
    }

    public void introduce() {
        super.introduce();
        System.out.println("職業：" + occupation);
        System.out.println("担当科目：" + subject);
    }
}

class Cook extends Person {
    private String occupation;
    private String specialDish;

    public Cook(String name, String occupation, String specialDish) {
        super(name);
        this.occupation = occupation;
        this.specialDish = specialDish;
    }

    public void introduce() {
        super.introduce();
        System.out.println("職業：" + occupation);
        System.out.println("得意料理：" + specialDish);
    }
}

class Mondai30 {
    public static void main(String[] args) {
        // Teacherクラスのインスタンス生成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go 言語");
        // Teacherクラスのintroduceメソッドを呼び出し
        teacher.introduce();

        System.out.println(); // 改行

        // Cookクラスのインスタンス生成
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");
        // Cookクラスのintroduceメソッドを呼び出し
        cook.introduce();
    }
}
