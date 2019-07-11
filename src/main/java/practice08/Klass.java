package practice08;

public class Klass {
    private int num;
    private Student student;
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
        this.student = jerry;
    }

    public Student getLeader() {
        return student;
    }
}
