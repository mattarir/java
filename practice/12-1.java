package practice;

import java.util.Scanner;

class Calculator {
    public int calcSum(int a, int b) {
        return a + b;
    }

    public double calcAve(int a, int b) {
        return (a + b) / 2.0;
    }
}

class MoreCalc extends Calculator {
    public double calcPow(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

class Mondai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // MoreCalcクラスのインスタンスを生成
        MoreCalc moreCalcInstance = new MoreCalc();

        // 2つの整数を入力
        System.out.print("整数を入力してください：");
        int num1 = scanner.nextInt();

        System.out.print("整数を入力してください：");
        int num2 = scanner.nextInt();

        // 合計値を計算して表示
        int sumResult = moreCalcInstance.calcSum(num1, num2);
        System.out.println("Sum " + num1 + " and " + num2 + " = " + sumResult);

        // 平均値を計算して表示
        double aveResult = moreCalcInstance.calcAve(num1, num2);
        System.out.println("Average " + num1 + " and " + num2 + " = " + aveResult);

        // 累乗を計算して表示
        double powResult = moreCalcInstance.calcPow(num1, num2);
        System.out.println("Power " + num1 + " of " + num2 + " = " + powResult);
    }
}
