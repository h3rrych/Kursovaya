import java.sql.SQLOutput;

public class Employee {
    private static int counter = 1;
    private String fullname;
    private int department;
    private double salary;
    private int id;

    public Employee(String fullname, int department, double salary) {
        this.id = counter++;
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Cотрудник " + id + " " +
                " Полное имя: " + fullname +
                ", Отдел: " + department +
                ", Зарплата в рублях = " + salary;
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }


    public static double totalSalaryInMonth(Employee[] employees) {
        double totalSalaryExpenses = 0;
        for (Employee employee : employees) {
            totalSalaryExpenses += employee.getSalary();
        }
        return totalSalaryExpenses;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Наименьшая зарплата: " + employeeWithMinSalary);
        return employeeWithMinSalary;


    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Наибольшая зарплата: " + employeeWithMaxSalary);
        return employeeWithMaxSalary;
    }

    public static double averageSalary (Employee[] employees) {
        double totalSalary = 0;
        totalSalary = totalSalaryInMonth(employees)/ employees.length;
        System.out.println("Средняя заработная плата сотрудников составляет " + totalSalary + " рублей");
        return totalSalary;


        }

    public static void namesEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullname());
        }
    }
    }




