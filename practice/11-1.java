package practice;

import java.util.Scanner;
class Circle {
   static final double PI = 3.1415;
   private double radius;
   public Circle(double radius) {
       this.radius = radius;
   }
   public double calculateCircumference() {
       return 2 * PI * radius;
   }
   public double calculateArea() {
       return PI * Math.pow(radius, 2);
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       System.out.print("半径を整数値で入力：");
       double radiusInput = scanner.nextDouble();

       Circle circleInstance = new Circle(radiusInput);
      
       double circumferenceResult = circleInstance.calculateCircumference();
       double areaResult = circleInstance.calculateArea();
     
       System.out.printf("円周の長さは %.3f です。\n", circumferenceResult);
       System.out.printf("円の面積は %.3f です。\n", areaResult);

       scanner.close();
   }
}