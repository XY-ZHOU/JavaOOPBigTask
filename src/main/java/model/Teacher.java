package main.java.model;



public class Teacher extends Person {
    public String[] klasses;

    public Teacher(int id, String name, int age, String[] klasses) {
        super(id, name, age);
        this.klasses = klasses;

    }

}
