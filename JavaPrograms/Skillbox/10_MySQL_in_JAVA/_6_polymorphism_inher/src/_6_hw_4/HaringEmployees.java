package _6_hw_4;

import java.util.ArrayList;

public class HaringEmployees {
    public static void haringEmployees(){
        int numberOfOperator = 1800;
        int numberOfManager = 800;
        int numberOfTopManager = 100;

        Company company = new Company();
        company.setIncome(100_000_000);
        for (int i = 0; i < numberOfManager ; i++)
            company.hire(new Manager());
        for (int i = 0; i < numberOfOperator ; i++)
            company.hire(new Operator());
        for (int i = 0; i < numberOfTopManager ; i++)
            company.hire(new TopManager());
        System.out.println("_________________before firing_______________________");
        ArrayList<EmployeeName> topSal= company.getTopSalaryStaff(15);
        System.out.println("______topSal________");

        for (EmployeeName e: topSal)
            System.out.println(e.type + " " + e.getMonthSalary());

        ArrayList<EmployeeName> lowestSal =  company.getLowestSalaryStaff(15);
        System.out.println("________________________lowestSal_____________________");
        for (EmployeeName e: lowestSal)
            System.out.println(e.type + " " + e.getMonthSalary());
        System.out.println("\t\t\t" + company.employees.size());

        int iOperator = 0;
        int iManager = 0;
        int iTopManager = 0;
        for (int i = 0; i < company.employees.size(); i++){
            if (company.employees.get(i) instanceof Operator){
                iOperator++;
                company.fire(company.employees.get(i));
            }
            if (company.employees.get(i) instanceof Manager){
                iManager++;
                company.fire(company.employees.get(i));
            }
            if (company.employees.get(i) instanceof TopManager){
                iTopManager++;
                company.fire(company.employees.get(i));
            }
            if (iOperator == numberOfOperator/2 && iManager == numberOfManager/2
                    && iTopManager == numberOfTopManager/2) break;
        }
        System.out.println("operator - " + iOperator + " manager - " + iManager + " topManger - " + iTopManager);
        System.out.println("_________________after firing_______________________");

        lowestSal =  company.getLowestSalaryStaff(15);
        topSal= company.getTopSalaryStaff(15);

        System.out.println("______________topSal________________");
        for (EmployeeName e: topSal)
            System.out.println(e.type + " " + e.getMonthSalary());
        System.out.println("__________lowestSal__________");
        for (EmployeeName e: lowestSal)
            System.out.println(e.type + " " + e.getMonthSalary());
        System.out.println("\t\t\t" + company.employees.size());
        double d = 2.0 - 2.1;
        System.out.println(d);
    }
}
