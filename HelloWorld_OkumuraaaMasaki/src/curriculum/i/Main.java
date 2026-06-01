package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(
                new FullTimeEmployee("E005", "山田太郎"));

        employees.add(
                new ContractEmployee("E006", "田中花子"));

        employees.add(
                new FullTimeEmployee("E007", "佐藤次郎"));

        for (Employee e : employees) {

            System.out.println(
                    e.name + " の給与: "
                    + e.calculateDailyWage(9)
                    + " 円"
            );
        }
    }
}