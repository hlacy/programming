package _6_hw_4;

public class TopManager extends EmployeeName implements Employee {
    double fixSalary = 200_000;
    double earnedMoney = 0;

    public TopManager(){
        earnedMoney = setMonthSalary();
        type = "T";
    }

    @Override
    public Double getMonthSalary() {
        return earnedMoney;
    }

    public Double setMonthSalary() {
        if (Company.getIncome() > 10_000_000)
            return fixSalary * 2.5 * Math.random();
        else return fixSalary * Math.random();
    }
}


