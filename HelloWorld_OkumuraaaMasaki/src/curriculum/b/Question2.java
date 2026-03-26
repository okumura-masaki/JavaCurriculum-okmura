package curriculum.b;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Q1
        int score1 = 75;
        if (score1 >= 60) {
            System.out.println("合格です！");
        }

        // Q2
        int age2 = 25;
        if (age2 >= 20 && age2 <= 30) {
            System.out.println("適正年齢です");
        } else {
            System.out.println("対象外です");
        }

        // Q3
        int age3 = 18;
        if (age3 >= 20) {
            System.out.println("成人です");
        } else if (age3 >= 13 && age3 <= 19) {
            System.out.println("ティーンエイジャーです");
        } else {
            System.out.println("子供です");
        }

        // Q4
        int x = 30, y = 15, z = 50;
        if (x >= y && x >= z) {
            System.out.println(x);
        } else if (y >= x && y >= z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        // Q5
        System.out.print("数値を入力してください: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0 です");
        } else {
            System.out.println("負の数です");
        }

        // Q6
        System.out.print("数値を入力してください: ");
        int value = scanner.nextInt();
        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        // Q7
        System.out.print("点数を入力してください（0〜100）: ");
        int score7 = scanner.nextInt();
        if (score7 >= 90) {
            System.out.println("優");
        } else if (score7 >= 70) {
            System.out.println("良");
        } else if (score7 >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        // Q8（←ここ重要）
        scanner.nextLine(); // 改行対策

        System.out.print("文字を入力してください: ");
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        }

        scanner.close();
    }
}