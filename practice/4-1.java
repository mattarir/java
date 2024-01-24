package practice;
import java.util.Scanner;

class mondai15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("0~100点までの得点を入力してください");
        int score = stdIn.nextInt();

        if (score >= 80 && score <= 100)
          System.out.println("合格です");
        
        else if (score <= 80)
          System.out.println("不合格です");
    }
}