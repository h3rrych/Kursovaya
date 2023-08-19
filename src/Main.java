import java.security.spec.ECPoint;

public class Main {
        public static void main (String[]args){
            System.out.println("Kурсовая");
            System.out.println("////////////////////");
            Employee employees[] = new Employee[10];
            employees[0] = new Employee("Иванов Иван", 1, 25000);
            employees[1] = new Employee("Богданов Богдан", 2, 30000);
            employees[2] = new Employee("Иванова Мария", 2, 25500);
            employees[3] = new Employee("Степанов Степан", 4, 34000);
            employees[4] = new Employee("Петров Петр", 5, 29000);
            employees[5] = new Employee("Гришин Григорий", 3, 32000);
            employees[6] = new Employee("Марков Марк", 5, 20000);
            employees[7] = new Employee("Сидоров Алексей", 4, 22000);
            employees[8] = new Employee("Алексеев Мандарин", 3, 28000);
            employees[9] = new Employee("Федоров Федор", 1, 40000);

            Employee.printAllEmployees(employees);
            System.out.println();
            System.out.println("Сумма затрат на зарплаты сотрудинков составляет: " +Employee.totalSalaryInMonth(employees) + " рублей");
            System.out.println();
            Employee.findEmployeeWithMinSalary(employees);
            System.out.println();
            Employee.findEmployeeWithMaxSalary(employees);
            System.out.println();
            Employee.averageSalary(employees);
            System.out.println();
            Employee.namesEmployees(employees);



        }
    }

