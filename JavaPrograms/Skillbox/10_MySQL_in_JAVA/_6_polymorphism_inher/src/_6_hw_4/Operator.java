package _6_hw_4;

public class Operator extends EmployeeName implements Employee {
    double fixSalary = 100_000;
    public Operator(){
        fixSalary = setMonthSalary();
        type = "O";
    }
    @Override
    public Double getMonthSalary() {
        return fixSalary;
    }
    public Double setMonthSalary() {
        return fixSalary * Math.random();

    }

    @Override
    public int compareTo(EmployeeName o) {
        if (getMonthSalary() > o.getMonthSalary()) return 1;
        if (getMonthSalary() < o.getMonthSalary()) return -1;
        else return 0;
    }
}
