package com.ironhack;

public class Employee {
    private String name;
    private int age;
    private String email;
    private double salary;

    Employee(String name, String email, int age, double salary) {
        setName(name);
        setAge(age);
        setEmail(email);
        setSalary(salary);
    }

//    public Employee() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }else {
            System.err.println("Employee name cannot be null");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0) {
            this.age = age;

        }else {
            System.err.println("Age must be greater than 0");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }else {
            System.err.println("Salary cannot be negative");
        }
    }
}
