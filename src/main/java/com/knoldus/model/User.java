package com.knoldus.model;

/**
 * This is a model class representing a User.
 */
public class User {
    Integer id;
    String name;
    String address;
    String age;

    public User(Integer id, String name, String address, String age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", address='" + address + '\''
                + ", age='" + age + '\''
                + '}';
    }
}
