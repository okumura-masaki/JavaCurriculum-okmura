package curriculum.a;

public class Question1 {

    public static void main(String[] args) {

        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
        q11();
        q12();
        q13();
    }

    // Q1
    public static void q1() {
        byte byteNum = 0;
        short shortNum = 0;
        int intNum = 0;
        long longNum = 0L;

        float floatNum = 0.0f;
        double doubleNum = 0.0;

        char letter = '\u0000';
        String letters = null;

        boolean isBoolean = false;

        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(letter);
        System.out.println(letters);
        System.out.println(isBoolean);
    }

    // Q2
    public static void q2() {
        byte byteNum = 10;
        short shortNum = 100;
        int intNum = 1000;
        long longNum = 10000L;

        float floatNum = 9.5f;
        double doubleNum = 10.5;

        char letter = 'a';
        String letters = "ハロー";

        boolean isBoolean = true;
    }

    // Q3
    public static void q3() {
        int num1 = 11110;
        System.out.println(num1 + " " + num1);

        int num2 = 20;
        System.out.println(num2 + " " + num2);

        String a = "a";
        String hello = "ハロー";
        boolean flag = true;
        System.out.println(a + " " + hello + " " + flag + " " + a + " " + hello + " " + flag);

        int sum = 1 + 1 + 1 + 3 + 0;
        System.out.println(sum);

        long product = 1 * 0 * 0 * 0 * 0 * 0 * 0 * 0 * 0 * 0 * 0;
        System.out.println(product);

        double x = 10.5;
        System.out.println(x / 100);

        int y = 10;
        System.out.println(y - 100);
    }

    // Q4
    public static void q4() {
        String name = "山田太郎";
        System.out.println("こんにちは、" + name + "さん！");
    }

    // Q5
    public static void q5() {
        int age = 25;
        System.out.println("年齢: " + age + "歳");
    }

    // Q6
    public static void q6() {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);
    }

    // Q7
    public static void q7() {
        int score = 80;
        score = score + 20;
        System.out.println("最終スコア: " + score);
    }

    // Q8
    public static void q8() {
        double price = 99.99;
        int intPrice = (int) price;
        System.out.println("整数価格: " + intPrice);
    }

    // Q9
    public static void q9() {
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        System.out.println("変換後の値: " + (num + 10));
    }

    // Q10
    public static void q10() {
        int num = 50;
        String numStr = String.valueOf(num);
        System.out.println("得点: " + numStr + "点");
    }

    // Q11
    public static void q11() {
        int a = 10;
        int b = 20;
        boolean result = (a < b) ? true : false;
        System.out.println(result);
    }

    // Q12
    public static void q12() {
        int x = 15;
        String result = (x >= 10) ? "OK" : "NG";
        System.out.println(result);
    }

    // Q13
    public static void q13() {
        String text = "私はJavaが好きです。Javaは楽しい！";
        String result = text.replace("Java", "Python");
        System.out.println(result);
    }
}