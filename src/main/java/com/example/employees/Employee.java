package com.example.employees;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {

    private static final AtomicLong counter = new AtomicLong(100);
    private long id;
    private String name;
    private String lastName;
    private String birthDate;
    private String role;
    private String department;
    private String email;

    public Employee(String name, String lastName, String birthDate, String role, String department, String email, long id) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
        this.department = department;
        this.email = email;
        this.id = id;
    }

    public Employee(String name, String lastName, String birthDate, String role, String department, String email) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
        this.department = department;
        this.email = email;
        this.id = counter.incrementAndGet();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
