package com.company.momo;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kiro", 2000,"cherry");
        Employee employee1 = new Employee("Pesho", 3000,"cherry");
        Employee employee2 = new Employee("Iva", 4000,"strawberry");
        Employee employee3 = new Employee("Kris", 1000,"strawberry");
        Employee employee4 = new Employee("Mariya", 5000,"strawberry");

        Employee[] cherryTeam = {employee, employee1};
        Employee[] strawberryTeam = {employee2, employee3, employee4};
        Employee[] allEmployees = {employee,employee1,employee2,employee3,employee4};

        Team cherry = new Team("Cherry Team", cherryTeam);
        Team strawberry = new Team("Strawberry Team", strawberryTeam);

        Team[] momoTeams = {cherry, strawberry};
        Company momo = new Company(allEmployees, momoTeams);

        System.out.println(momo.getAllEmployees());
        System.out.println(momo.getTeamMembersByTeam(momo.getTeams()[0]));
        System.out.println(momo.getTeamMembersByTeam(momo.getTeams()[1]));
    }
}
