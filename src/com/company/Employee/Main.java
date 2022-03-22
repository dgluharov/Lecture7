package com.company.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", "Dimitrov", 1000);
        Employee e2 = new Employee("Georgi", "Petkov", 1100);


        System.out.println(getAverageSalary(e1,e2));
    }

    public static int getAverageSalary(Employee e1, Employee e2){
        return (e1.getSalary() + e2.getSalary()) / 2;
    }
}
