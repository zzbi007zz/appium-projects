package Java.lab7_1;

public class ContractEmployee extends Employee {
    private static final int CONTRACT_SALARY = 4000;
    public ContractEmployee(){
        super();
    }
    @Override
    public int getSalary() {
        return CONTRACT_SALARY;
    }
}
