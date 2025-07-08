package com.autobots.java.streamapi;

public class Employee {

    private int id ;
    private  int age;
    private String name;
    private  int salary;
    private  String depardment;

    public Employee(int id,String name, int age,  int salary ,String depardment) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.depardment = depardment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        this.salary = salary;
    }

    public String getDepardment() {
        return depardment;
    }

    public void setDepardment(String depardment) {
        this.depardment = depardment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", depardment='" + depardment + '}' +
                '\n';
    }
}
