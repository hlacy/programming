package _6_hw_4;

public abstract class EmployeeName implements Comparable<EmployeeName> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = new String();
    public Double getMonthSalary(){
       return  0.0;
    };
    public String type;

    @Override
    public int compareTo(EmployeeName o) {
        if (getMonthSalary() > o.getMonthSalary()) return 1;
        if (getMonthSalary() < o.getMonthSalary()) return -1;
        else return 0;
    }


}
