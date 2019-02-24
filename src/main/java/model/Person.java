package main.java.model;

public class Person {
    public int id;
    public String name;
    public int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return ("My name is " + name + ". I am " + age + " years old.");
    }
}
