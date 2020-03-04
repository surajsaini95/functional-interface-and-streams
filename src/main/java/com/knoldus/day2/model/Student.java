package com.knoldus.day2.model;

import java.util.Optional;

public class Student {
    int id;
    String name;
    int age;
    Address address;

    public Student() {
        id=0;
        name=null;
        age=0;
        address=null;
    }

    public int getId() {
        return id;
    }

    public Student(int id, String name, int age, String primaryAddress, String secondaryAddress) {
        this.id = id;
        this.name = name;
        this.age = age;
        Address address = new Address(primaryAddress, Optional.ofNullable(secondaryAddress));
        this.address = address;
    }

    public Student(int id, String name, int age, String primaryAddress) {
        this.id = id;
        this.name = name;
        this.age = age;
        Address address = new Address(primaryAddress, Optional.empty());
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public boolean isValid() {
        if(this.id>0)
            return true;
        else
            return false;
    }
}
