package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Billable> employees = new ArrayList<>();

        employees.add(
                new FullTimeEmployee("E008", "山田太郎"));

        employees.add(
                new ContractEmployee("E009", "田中花子"));

        for (Billable employee : employees) {

            System.out.println(
                    "日給: "
                    + employee.costForDay(9)
                    + " 円"
            );
        }
    }
}