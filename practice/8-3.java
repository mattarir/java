package practice;

import java.util.Scanner;
class mondai27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[10];
        int[] evenArray;
        int[] oddArray;
     
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("%d 件目：整数を入力 = ", i + 1);
            inputArray[i] = scanner.nextInt();
        }
      
        int evenCount = 0, oddCount = 0;
        for (int value : inputArray) {
            if (value % 2 == 0) {
               evenCount++;
            } else {
               oddCount++;
            }
        }
       
        evenArray = new int[evenCount];
        oddArray = new int[oddCount];
      
        evenCount = 0;
        oddCount = 0;
        for (int value : inputArray) {
            if (value % 2 == 0) {
               evenArray[evenCount++] = value;
            } else {
               oddArray[oddCount++] = value;
            }
        }
      
        System.out.println("偶数値配列 = " + java.util.Arrays.toString(evenArray));
        System.out.println("奇数値配列 = " + java.util.Arrays.toString(oddArray));
     
        scanner.close();
    }
}