package com.ironhack;

import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Robert King", "robert.king@email.com", 34, 27000);
        employees[1] = new Employee("Laura Scott", "laura.scott@email.com", 29, 21000);
        employees[2] = new Employee("Kevin Turner", "kevin.turner@email.com", 41, 32000);
        employees[3] = new Employee("Natalie Adams", "natalie.adams@email.com", 26, 17000);
        employees[4] = new Employee("Brian Nelson", "brian.nelson@email.com", 38, 29000);
        employees[5] = new Employee("Samantha Carter", "samantha.carter@email.com", 30, 24000);
        employees[6] = new Employee("Andrew Mitchell", "andrew.mitchell@email.com", 45, 35000);
        employees[7] = new Employee("Rachel Perez", "rachel.perez@email.com", 23, 90000);
        employees[8]=new Intern("Max Safarli","Maxsafarli123@gmail.com",22,2100);
        employees[9]=new Intern("Ali Safarli","alisafarli@gmail.com",20,22000);




        makeEmployeesFile(employees);

    }

    public static String getDetailsEmployess(Employee employee) {
        return String.format("""
                Name: %s
                Email: %s
                Age: %d
                Salary: %.2f
                ================
                """, employee.getName(), employee.getEmail(), employee.getAge(), employee.getSalary());
    }

    public static void  makeEmployeesFile(Employee[]employees){
        String fileName = "employees.txt";

        try(FileWriter writer = new FileWriter(fileName)) {
            for (Employee employee : employees) {
                String content = getDetailsEmployess(employee);

                writer.write(content);
            }
            System.out.println("New file created successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
