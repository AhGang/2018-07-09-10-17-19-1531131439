package practice11;


import java.util.ArrayList;
import java.util.List;
public class Klass {
    private int num;
    private Student student;
    private String name;
    private Student leader;
    private List<Teacher> teachers;


    private boolean isInClass = false;
    public Klass(int num) {
        this.num = num;
        this.teachers = new ArrayList<>();
    }

    public int getNumber() {
        return this.num;
    }

    public String getDisplayName() {
        return "Class " + this.num;
    }

    public void assignLeader(Student student) {
        if (this.num==(student.getKlass().num)) {
            this.leader = student;
            teachers.forEach(teacher ->System.out.print("I am " +teacher.getName()+". I know " + student.getName() + " become Leader of Class" + num + ".\n"));
            teachers.forEach(teacher -> System.out.print("I am "+teacher.getName()+". I know "+student.getName()+" has joined Class +"+ num +".\n"));

        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public boolean isInClass() {
        return isInClass;
    }
    public void appendTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public Student getLeader() {
        return this.student;
    }

    public void appendMember(Student student) {

        isInClass = true;
        this.name = student.getName();
        student.setKlass(this);
        teachers.forEach(teacher -> System.out.print("I am "+teacher.getName()+". I know "+student.getName()+" has joined Class +"+ num +".\n"));

    }
}
