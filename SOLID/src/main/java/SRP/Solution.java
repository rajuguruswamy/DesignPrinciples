package SRP;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle");

        System.out.println("===========Class without Single Responsibility Principle=============");
        Employee e = new Employee();
        e.Save();
        e.calculateSalary();

        System.out.println("===========Class with Single Responsibility Principle=============");

        EmployeeSRP employeeSRP = new EmployeeSRP("raju");
        // calculate employee salary in a separate class
        SalaryCalculatorSRP  salaryCalculatorSRP =  new SalaryCalculatorSRP();
        salaryCalculatorSRP.calculateSalary(employeeSRP);
        employeeSRP.save();

        System.out.println("Employee Name  " +  employeeSRP.getName());
        System.out.println("Employee Salary  " +  employeeSRP.getSalary());

    }
}
