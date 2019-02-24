package main.java.model;

public class Student extends Person {
    public Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;

    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass.leader == null || !klass.leader.equals(this.name))
            return (super.introduce() + " I am a Student. I am at Class " + getKlass().number);
        else
            return (super.introduce() + " I am a Student. I am a leader of " + getKlass().number);
    }

}
