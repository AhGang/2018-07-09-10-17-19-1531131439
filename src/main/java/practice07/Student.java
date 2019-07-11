package practice07;

public class Student extends Person {
    private Klass klass;
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        return "My name is "+this.getName() + ". I am "+ this.getAge() + " years old. I am a Student. I am at Class " + klass.getNumber() +".";
    }

    public Klass getKlass() {
        return klass;
    }
}
