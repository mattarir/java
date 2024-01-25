package test13_3;

class Teacher implements Person {
    private String name;
    private String occupation;
    private String subject;

    public Teacher(String name, String occupation, String subject) {
        this.name = name;
        this.occupation = occupation;
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + occupation);
        System.out.println("担当科目：" + subject);
    }
}