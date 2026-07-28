class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeManagement {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    // Add Employee
    static void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
            System.out.println("Employee added");
        } else {
            System.out.println("No space available");
        }
    }

    // Search Employee
    static void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                System.out.println("Employee Found");
                employees[i].display();
                return;
            }
        }

        System.out.println("Employee not found");
    }

    // Display Employees
    static void displayEmployees() {

        if (count == 0) {
            System.out.println("No employees");
            return;
        }

        System.out.println("Employee List");

        for (int i = 0; i < count; i++) {
            employees[i].display();
            System.out.println();
        }
    }

    // Delete Employee
    static void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee deleted");
                return;
            }
        }

        System.out.println("Employee not found");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Rahul", "Developer", 55000));
        addEmployee(new Employee(102, "Priya", "Designer", 48000));
        addEmployee(new Employee(103, "Arjun", "Tester", 45000));

        displayEmployees();

        searchEmployee(102);

        deleteEmployee(101);

        displayEmployees();
    }
}