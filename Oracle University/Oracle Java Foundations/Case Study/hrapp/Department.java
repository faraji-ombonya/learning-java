import java.util.Arrays;

public class Department {
    private Employee[] employees = new Employee[10];
    private int nextIndex = 0;
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        if (nextIndex < 10) {
            employees[nextIndex] = employee;
            nextIndex++;
        }
    }

    public double calculateAverageSalary() {
        return getTotalSalary() / getNumberOfEmployees();
    }

    public Employee[] getEmployees() {
        Employee[] validEmployees = new Employee[nextIndex];
        System.arraycopy(employees, 0, validEmployees, 0, nextIndex);
        return validEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEmployees() {
        return nextIndex;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;

        for (Employee employee : getEmployees()) {
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }

    public Employee searchEmployee(int id) {
        for (Employee employee : getEmployees()) {
            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return getName();
    }
}
