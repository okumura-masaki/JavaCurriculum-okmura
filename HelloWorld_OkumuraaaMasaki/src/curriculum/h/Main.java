package curriculum.h;

public class Main {

    public static void main(String[] args) {

        FullTimeEmployee fullTime =
                new FullTimeEmployee("E003", "鈴木一郎");

        PartTimeEmployee partTime =
                new PartTimeEmployee("E004", "高橋花子");

        System.out.println(
                "正社員の給与: "
                + fullTime.calculateDailyWage(9)
                + " 円"
        );

        System.out.println(
                "パート社員の給与: "
                + partTime.calculateDailyWage(9)
                + " 円"
        );
    }
}