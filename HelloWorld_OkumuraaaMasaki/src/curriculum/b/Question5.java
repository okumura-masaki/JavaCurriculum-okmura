package curriculum.b;

public class Question5 {

    public static void main(String[] args) {

        // Q1
        helloWorld();

        // Q2
        int result = doubleValue(10);
        System.out.println("10 を 2 倍すると " + result + " です。");

        // Q3
        int num1 = 7;
        int num2 = 10;

        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }

        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }
    }

    // Q1
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    // Q2
    public static int doubleValue(int num) {
        return num * 2;
    }

    // Q3
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
