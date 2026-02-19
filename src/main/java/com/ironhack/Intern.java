package com.ironhack;

public class Intern extends Employee {

    private static final double SALARY_LIMIT=20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(double salary) {
        if(salary>SALARY_LIMIT){
            System.err.println("Salary must be maximum 2000");
        return;
        }

        super.setSalary(salary);
    }
}
