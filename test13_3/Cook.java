package test13_3;

class Cook implements Person {
    private String name;
    private String occupation;
    private String specialDish;

    public Cook(String name, String occupation, String specialDish) {
        this.name = name;
        this.occupation = occupation;
        this.specialDish = specialDish;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + occupation);
        System.out.println("得意料理：" + specialDish);
    }
}
