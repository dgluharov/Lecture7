package com.company.momo;

public class Employee {
    private String name;
    private int salary;
    private String team;

    public Employee(String name, int salary, String team) {
        this.name = name;
        setSalary(salary);
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Wrong value! You should enter positive number");
        }
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
