package main.java.model;

public class Student extends Person {
    public   Klass klass;
    public Student(int id, String name, int age,Klass klass){
        super(id,name,age);
        this.klass=klass;

    }
    public Klass getKlass() {
        return klass;
    }

}
