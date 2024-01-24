package practice;

class CalculationExecutor {
   static int x, y;
   public static int calculateSum() {
       int sum = 0;
       for (int i = x; i <= y; i++) {
           sum += i;
       }
       return sum;
   }
}
class Main {
   public static void main(String[] args) {
       // Set values for x and y
       CalculationExecutor.x = 100;
       CalculationExecutor.y = 200;
       // Calculate the sum using CalculationExecutor class
       int sumResult = CalculationExecutor.calculateSum();
       // Display results
       System.out.printf("%d から %d までの合計値は %d です。\n", CalculationExecutor.x, CalculationExecutor.y, sumResult);
   }
}