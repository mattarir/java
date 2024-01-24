package chap4;

//数あてゲーム(0~99を当てさせる)

import java.util.Random;
import java.util.Scanner;

class Kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        int no = rand.nextInt(100);     //充てるべき数:0～99までの乱数として生成

        System.out.println("数あてゲーム開始!!");
        System.out.println("0~99の数を当ててください。");

        int x;
        do {
            System.out.println("いくつかな：");
            x = stdIn.nextInt();

            if (x > no)
              System.out.println("もっと小さな数だよ。");
            else if (x < no)
              System.out.println("もっと大きな数だよ。");     
            } while (x != no);

            System.out.println("正解です");
    }
}

