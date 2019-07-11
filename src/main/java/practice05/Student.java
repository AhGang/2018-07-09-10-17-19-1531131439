package practice05;

public class Student {
    private String name;

    private int age;
    private int klass;
    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        return "My name is "+this.getName() + ". I am "+ this.getAge() + " years old. I am a Student. I am at Class " + this.getKlass() +".";
    }
}