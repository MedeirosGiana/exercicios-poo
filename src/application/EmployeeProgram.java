package application;

import entity.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("****Enter employee data****");
        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.println();
        System.out.print("Salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.print("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double porcentege = sc.nextDouble();
        employee.increaseSalary(porcentege);

        System.out.println();
        System.out.print("Update data: " + employee);

        sc.close();
    }
}
