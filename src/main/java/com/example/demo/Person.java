package com.example.demo;

public class Person {
    private String name;
    private int age;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Factory<Person>  personFactory = new Factory<>();
        Person person = personFactory.create(Person.class);
        System.out.println(person);

        Factory<Student> studentFactory = new Factory<>();
        Student student = studentFactory.create(Student.class);
        System.out.println(student);
    }
}
