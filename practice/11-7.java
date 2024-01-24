package practice;

import java.text.DecimalFormat;
class Student {
   private String name;
   private String studentNumber;
   private int japanese;
   private int math;
   private int english;
   public Student(String name, String studentNumber, int japanese, int math, int english) {
       this.name = name;
       this.studentNumber = studentNumber;
       this.japanese = japanese;
       this.math = math;
       this.english = english;
   }
   public double calculateAverage() {
       int totalScore = japanese + math + english;
       double average = (double) totalScore / 3;
       DecimalFormat df = new DecimalFormat("#.##");
       return Double.parseDouble(df.format(average));
   }
   public int calculateTotal() {
       return japanese + math + english;
   }
   public String getStudentNumber() {
       return studentNumber;
   }
   public String getName() {
       return name;
   }
}
class Mondai28 {
   public static void main(String[] args) {
       Student[] students = {
               new Student("A さん", "001", 89, 65, 88),
               new Student("B さん", "002", 80, 95, 64),
               new Student("C さん", "003", 70, 80, 98)
       };
       for (Student student : students) {
           double average = student.calculateAverage();
           System.out.println(student.getStudentNumber() + " 番 " + student.getName() + " 平均点 " + average);
       }
   }
}