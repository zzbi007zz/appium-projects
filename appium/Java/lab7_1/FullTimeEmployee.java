package Java.lab7_1;

public class FullTimeEmployee extends Employee {

    private static final int FULL_TIME_SALARY = 5000;

    public FullTimeEmployee() {
        super();
    }

    @Override
    public int getSalary() {
        return FULL_TIME_SALARY;
    }


}
