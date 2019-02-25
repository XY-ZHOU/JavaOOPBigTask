package main.java.model;

import java.util.Arrays;

public class Klass {
    public String number;
    public String leader;

    public Klass(String number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (student.klass.number.equals(number)) {
            this.leader = student.name;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        assignLeader(student);
    }

    public boolean isIn(String[] klasses) {
        return (Arrays.asList(klasses).contains(number));
    }


}
