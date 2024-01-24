package practice;

class CalculationExecutor {
   int x, y;
   public CalculationExecutor(int x, int y) {
       this.x = x;
       this.y = y;
   }
   public int calculateSum() {
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
       int xValue = 100;
       int yValue = 200;
       // Create an instance of CalculationExecutor
       CalculationExecutor calculator = new CalculationExecutor(xValue, yValue);
       // Calculate the sum using the instance
       int sumResult = calculator.calculateSum();
       // Display results
       System.out.printf("%d から %d までの合計値は %d です。\n", xValue, yValue, sumResult);
   }
}