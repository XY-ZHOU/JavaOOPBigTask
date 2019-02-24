import main.java.model.Klass;
import main.java.model.Person;
import main.java.model.Student;
import main.java.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Person person=new Person(12,"Tom",21);
        Klass klassOne=new Klass("2");
        Klass klassTwo=new Klass("1");
        Student studentOne=new Student(12,"Jerry",21,klassOne);
        Student studentTwo=new Student(12,"Lily",21,klassOne);
        Student studentThree=new Student(12,"Amy",21,klassTwo);
        ((Student) studentOne).klass.assignLeader(studentOne);
        ((Student) studentTwo).klass.assignLeader(studentOne);
        String[] klassesOne={"2","3"};
        Teacher teacherOne=new Teacher(12,"Tom",21,klassesOne);
        String[] klassesTwo={};
        Teacher teacherTwo=new Teacher(12,"Tom",21,klassesTwo);

        System.out.println(person.introduce());
        System.out.println(studentOne.introduce());
        System.out.println(studentOne.introduce());
        System.out.println(studentOne.klass.appendMember(studentThree));
        System.out.println(""+teacherOne.introduce());
        System.out.println(""+teacherTwo.introduce());
        System.out.println(teacherOne.isTeaching(studentOne));
        System.out.println(teacherOne.isTeaching(studentTwo));
    }
}
