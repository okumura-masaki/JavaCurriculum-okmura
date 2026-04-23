package curriculum.b;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Q1
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Q1");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // Q2
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println("Q2");
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.println(array2[i]);
        }
    
        // Q3
        int[] array3 = {3, 5, 7, 9, 11};
        int sum = 0;
        System.out.println("Q3");
        for (int num : array3) {
            sum += num;
        }
        System.out.println("合計：" + sum);

        // Q4
        int[] array4 = {12, 7, 9, 21, 5, 18};
        int max = array4[0];
        int min = array4[0];
        System.out.println("Q4");

        for (int num : array4) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);

        // Q5
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println("Q5");

        // 値を2倍にする
        for (int i = 0; i < array5.length; i++) {
            array5[i] = array5[i] * 2;
        }

        // 拡張for文で表示
        for (int num : array5) {
            System.out.println(num);
        }
        
     // Q6
        System.out.println("Q6");
        int[] array6 = {4, 7, 10, 15, 20};
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力してください：");
        int input = scanner.nextInt();

        boolean found = false;

        for (int num : array6) {
            if (num == input) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + "は配列に含まれています");
        } else {
            System.out.println(input + "は配列に含まれていません");
        }
    }
}