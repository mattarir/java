package practice;

class ArrayExample {
   public static void main(String[] args) {
      
       int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 
       for (int i = 0; i < list.length; i++) {
           System.out.printf("list[%d] = %d\n", i, list[i]);
       }
   }
}