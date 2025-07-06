
import java.util.Scanner;

class Employee {

    void work() {
        System.out.println("Employee is working");
    }

    void salary() {
        System.out.println("Employee is getting salary");
    }
}

class HR_Manager extends Employee {

    void AddEmployee() {
        System.out.println("HR id adding Employee");
    }
}

public class Employe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        emp.work();
        emp.salary();
        HR_Manager hrm = new HR_Manager();
        System.out.println("ADD Employee");
        hrm.AddEmployee();

    }
}

// System.out.println("Employee is working");
//     }
//     public double getSalary() {
//         return 30000.0;
//     }
// }
// class HRManager extends Employee {
//     public void work() {
//         System.out.println("HR Manager is managing employee relations");
//     }
//     public void addNewEmployee() {
//         System.out.println("HR Manager is adding a new employee to the company");
//     }
// }
// public class Employe {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Employee emp = new Employee();
//         emp.work();
//         System.out.println("Salary: " + emp.getSalary());
//         HRManager hr = new HRManager();
//         hr.work();
//         System.out.println("Salary: " + hr.getSalary());
//         hr.addNewEmployee();

