package practice11;


import java.util.ArrayList;
import java.util.List;
public class Klass {
    private int num;
    private Student student;
    private String name;


    private boolean isInClass = false;
    public Klass(int num) {
        this.num= num;
    }

    public int getNumber() {
        return this.num;
    }

    public String getDisplayName() {
        return "Class " + this.num;
    }

    public void assignLeader(Student jerry) {
        System.out.print("It is not one of us.\n");
        if(isInClass){
            this.student = jerry;
        }

    }
    public boolean isInClass() {
        return isInClass;
    }
    public Student getLeader() {
        return this.student;
    }

    public void appendMember(Student student) {
        isInClass = true;
        this.name = student.getName();
    }
}
