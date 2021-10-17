package sef.FinialActivity;

import sef.module6.sample.Employee_A;
import sef.module6.sample.Person_I;

import java.util.ArrayList;
import java.util.Comparator;

public class FirstActivity {

    public static void main(String arg[]) {
        Person p = new Person();
        p.setName("John");
        p.setAge(22);

        System.out.println("-----------------------------");

        Employee e = new Employee();
        e.setName("John");
        e.setAge(22);
        e.setCompany("Accenture");
        e.setJobTitle("QA Engineer");
        e.setSalary(1000);

        Employee e1 = new Employee();
        e.setName("Kate");
        e.setAge(28);
        e.setCompany("Accenture");
        e.setJobTitle("QA Engineer");
        e.setSalary(1125);

        Employee e3 = new Employee();
        e.setName("Sean");
        e.setAge(34);
        e.setCompany("Accenture");
        e.setJobTitle("QA Engineer");
        e.setSalary(2500);

        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + e.getName());
        System.out.println("Employee's Age is    : " + e.getAge());
        System.out.println("Employee's Company is  : " + e.getCompany());
        System.out.println("Employee's JobTitle is : " + e.getJobTitle());
        System.out.println("Employee's Salary is : " + e.getSalary());

        System.out.println("-----------------------------");
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());

       employeeList.sort(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary));

       for (int i = employeeList.size()-1; i>=0; i--) {
           System.out.println("Employee name: " + employeeList.get(i).getName + "Employee Age;" + employeeList.get(i).getAge + "and salary" + employeeList.get(i).getSalary()+"!");
       }




    }
}
