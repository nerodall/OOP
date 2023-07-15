package task1;
import java.util.List;

public class Accounting {
    private int baseSalary;
    private List<Employee> empList;
    public Accounting(int baseSalary, List<Employee> empList) {
        this.baseSalary = baseSalary;
        this.empList = empList;
    }
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}