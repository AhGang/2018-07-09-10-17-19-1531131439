package practice07;

public class Klass {
    private int num;
    public Klass(int num) {
        this.num= num;
    }

    public int getNumber() {
        return this.num;
    }

    public String getDisplayName() {
        return "Class " + this.num;
    }
}
