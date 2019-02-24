package main.java.model;



public class Klass {
    public String number;
    public String leader;
    public Klass(String number){
        this.number=number;
    }
    public void assignLeader(Student student){
        this.leader = student.name;
    }



}
