package Java.lab7_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {

    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new FullTimeEmployee();
        Employee emp3 = new FullTimeEmployee();
        Employee contractEmp1 = new ContractEmployee();
        Employee contractEmp2 = new ContractEmployee();
        EmployeeCalculator empCalculate = new EmployeeCalculator();
        System.out.println("Total salary: "+empCalculate.getTotalSalary(Arrays.asList(emp1,emp2,emp3,contractEmp1,contractEmp2)));
    }
}
