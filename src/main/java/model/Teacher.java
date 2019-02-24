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

    public String isTeaching(Student student) {
        Klass klassOfStudent = student.getKlass();
        if (klassOfStudent.isIn(klasses)) {
            if ((student.name).equals(student.klass.leader)) {
                return "I am " + name + ". I know " + student.name + " become Leader of Class " + student.klass.number + ".";
            } else {
                return "I am " + name + ". I know " + student.name + " has joined Class " + student.klass.number + ".";
            }
        } else {
            return "";
        }
    }
}
