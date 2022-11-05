package _6_hw_4;

public class Manager extends EmployeeName implements Employee {

    double fixSalary = 100_000;
    double earnedMoney = 0;
    double earnedMoneyMin = 115_000;
    double earnedMoneyMax = 140_000;

    public Manager(){
        earnedMoney = setMonthSalary();
        type = "M";
    }

    @Override
    public Double getMonthSalary() {
        return earnedMoney;
    }
    private Double setMonthSalary() {
        earnedMoney = Math.ceil(((Math.random() * (earnedMoneyMax - earnedMoneyMin)) + earnedMoneyMin) * 100) / 100;
        return fixSalary + earnedMoney * 0.5;
    }

    @Override
    public int compareTo(EmployeeName o) {
        if (getMonthSalary() > o.getMonthSalary()) return 1;
        if (getMonthSalary() < o.getMonthSalary()) return -1;
        else return 0;
    }
}
