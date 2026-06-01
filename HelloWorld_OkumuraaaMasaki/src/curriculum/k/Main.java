package curriculum.k;

public class Main {

    public static void main(String[] args) {

        Payable fullTime =
                new FullTimeEmployee("山田太郎", 8);

        Payable contract =
                new ContractEmployee("田中花子", 8);

        SalaryReporter reporter = new SalaryReporter();

        reporter.printSalary(fullTime);
        reporter.printSalary(contract);
    }
}
