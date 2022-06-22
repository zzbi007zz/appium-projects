package Java.lab7_1;

import java.util.List;

public class EmployeeCalculator {
    public int getTotalSalary(List<Employee> empList) {
        int totalSalary = 0;
        for (Employee emp: empList) {
            totalSalary += emp.getSalary() ;
        }
        return totalSalary;
    }



}
