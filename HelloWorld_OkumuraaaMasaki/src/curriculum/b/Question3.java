package curriculum.b;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Q1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Q2
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // Q3
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Q4
        int sum4 = 0;
        for (int i = 1; i <= 100; i++) {
            sum4 += i;
        }
        System.out.println("合計: " + sum4);

        // Q5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Q6
        int i6 = 1;
        while (i6 <= 10) {
            System.out.println(i6);
            i6++;
        }

        // Q7
        int i7 = 2;
        while (i7 <= 20) {
            System.out.println(i7);
            i7 += 2;
        }

        // Q8
        int i8 = 10;
        while (i8 >= 1) {
            System.out.println(i8);
            i8--;
        }

        // Q9
        int i9 = 1;
        int sum9 = 0;
        while (i9 <= 100) {
            sum9 += i9;
            i9++;
        }
        System.out.println("合計は：" + sum9);

        // Q10
        int num = -1;
        while (num != 0) {
            System.out.print("数値を入力してください（0で終了）：");
            num = scanner.nextInt();
        }
        System.out.println("終了しました");

        // Q11
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%02d * %02d = %02d", i, j, i * j);
                if (j != 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}