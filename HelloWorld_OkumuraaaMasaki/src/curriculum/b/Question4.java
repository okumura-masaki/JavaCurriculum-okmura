package curriculum.b;

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
    }
}