package com.company.momo;

public class Company {
    private Employee[] employees;
    private Team[] teams;

    public Company(Employee[] employees, Team[] teams) {
        this.employees = employees;
        this.teams = teams;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    String getAllEmployees(){
        StringBuilder result = new StringBuilder("Momo company employee list:");
        for (int i = 0; i < this.employees.length; i++) {
            result.append("\n")
                    .append(employees[i].getName())
                    .append(": Salary - ").append(employees[i].getSalary())
                    .append(" Team - ").append(employees[i].getTeam());
        }
        return result.toString();
    }

    String getTeamMembersByTeam(Team team){
        StringBuilder result = new StringBuilder("Team members in " + team.getName() + ":\n");
        for (int i = 0; i < team.getEmployees().length; i++) {
            result.append(team.getEmployees()[i].getName())
                    .append("\n");
        }
        return result.toString();
    }
}
