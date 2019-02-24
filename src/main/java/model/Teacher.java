package main.java.model;



public class Teacher extends Person {
    public String[] klasses;

    public Teacher(int id, String name, int age, String[] klasses) {
        super(id, name, age);
        this.klasses = klasses;

    }
    public String introduce() {
        String str = String.join(",", klasses);
        return str.length() == 0 ? super.introduce() + " I am a Teacher. I teach No Class." : super.introduce() + " I am a Teacher. I teach Class " + str + ".";
    }
}
