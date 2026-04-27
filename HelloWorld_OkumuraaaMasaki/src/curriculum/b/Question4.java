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
        int sum3 = 0;
        System.out.println("Q3");
        for (int num : array3) {
            sum3 += num;
        }
        System.out.println("合計：" + sum3);

        // Q4
        int[] array4 = {12, 7, 9, 21, 5, 18};
        int max4 = array4[0];
        int min4 = array4[0];
        System.out.println("Q4");

        for (int num : array4) {
            if (num > max4) {
                max4 = num;
            }
            if (num < min4) {
                min4 = num;
            }
        }

        System.out.println("最大値：" + max4);
        System.out.println("最小値：" + min4);

        // Q5
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println("Q5");

        for (int i = 0; i < array5.length; i++) {
            array5[i] = array5[i] * 2;
        }

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

        // Q7
        System.out.println("Q7");
        int[][] array7 = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                System.out.println(array7[i][j]);
            }
        }

        // Q8
        System.out.println("Q8");
        int[][] array8 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int sum8 = 0;

        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                sum8 += array8[i][j];
            }
        }

        System.out.println("合計：" + sum8);

        // Q9
        System.out.println("Q9");
        int[][] array9 = {
            {12, 15, 8},
            {6, 19, 25},
            {30, 2, 10}
        };

        int max9 = array9[0][0];
        int min9 = array9[0][0];

        for (int i = 0; i < array9.length; i++) {
            for (int j = 0; j < array9[i].length; j++) {

                if (array9[i][j] > max9) {
                    max9 = array9[i][j];
                }

                if (array9[i][j] < min9) {
                    min9 = array9[i][j];
                }
            }
        }

        System.out.println("最大値：" + max9);
        System.out.println("最小値：" + min9);

        // Q10
        System.out.println("Q10");
        int[][][] array10 = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        for (int i = 0; i < array10.length; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                for (int k = 0; k < array10[i][j].length; k++) {
                    System.out.println(array10[i][j][k]);
                }
            }
        }
       
     // Scannerをクローズする
        scanner.close();
    }
}