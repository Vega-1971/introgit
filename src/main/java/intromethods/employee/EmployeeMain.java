package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp_1 = new Employee("Vetró Gábor", 1997, 150000);

        emp_1.raiseSalary(1000);

        System.out.println(emp_1);
    }
}
