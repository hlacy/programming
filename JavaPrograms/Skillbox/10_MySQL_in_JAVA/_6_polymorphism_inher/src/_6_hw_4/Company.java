package _6_hw_4;

import java.util.*;

public class Company {
    List<EmployeeName> employees = new ArrayList<>();
    private static double income = 0;

    public void hire(EmployeeName employee){
        employees.add(employee);
    }

    public void hireAll(ArrayList<EmployeeName> employees){
        this.employees.addAll(employees);
    }
    public void fire(EmployeeName employee){  ////doesnt work
        employees.remove(employee);
    }

    public static double getIncome(){
        return income;
    }
    public void setIncome(double income){
        this.income = income;
    }

	public ArrayList<EmployeeName> getLowestSalaryStaff(int count){
        List<EmployeeName> topSalsryStaff = new ArrayList<>();
        Collections.sort(employees);

        if (employees.size() >= count) {
            for (int i = 0; i < count; i++) {
                topSalsryStaff.add(employees.get(i));
            }
            return (ArrayList<EmployeeName>) topSalsryStaff;
        }
        else {
            for (EmployeeName e: employees){
                topSalsryStaff.add(e);
            }
            return (ArrayList<EmployeeName>) topSalsryStaff;
        }
    }
	ArrayList<EmployeeName> getTopSalaryStaff(int count){
        ArrayList<EmployeeName> topSalsryStaff = new ArrayList<>();
        Collections.sort(employees, Collections.reverseOrder());

        if (employees.size() >= count) {
            for (int i = 0; i < count; i++) {
                topSalsryStaff.add(employees.get(i));
            }
            return topSalsryStaff;
        }
        else {
            for (EmployeeName e: employees){
                topSalsryStaff.add(e);
            }
            return topSalsryStaff;
        }
    }



}
