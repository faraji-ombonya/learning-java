public class HrApp {

    public static void main(String[] args) {

        IO.println("HR App Starts");

        Department salesDepartment = new Department("Sales Department");

        IO.println("Department: " + salesDepartment);

        Employee michael = new Employee(1, "Michael", 400000);
        Employee jim = new Employee(2, "Jim", 350000);
        Employee dwight = new Employee(3, "Dwight", 300000);
        Employee pam = new Employee(4, "Pam", 250000);

        salesDepartment.addEmployee(jim);
        salesDepartment.addEmployee(dwight);

        for (Employee employee : salesDepartment.getEmployees()) {
            IO.println(employee);
        }

        IO.println("Total Salary: " + salesDepartment.getTotalSalary());
        IO.println("Average Salary: " + salesDepartment.calculateAverageSalary());
        // IO.println("Number of employees: " + salesDepartment.getNumberOfEmployees());
        // IO.println("Found employee: " + salesDepartment.searchEmployee(1));
    }
}
