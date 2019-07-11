package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public String introduce() {
        if(klass.isInClass()){
            return "My name is "+this.getName() + ". I am "+ this.getAge() + " years old. I am a Student. I am Leader of Class " + klass.getNumber() +".";
        }else{
            return "My name is "+this.getName() + ". I am "+ this.getAge() + " years old. I am a Student. I am at Class " + klass.getNumber() +".";
        }

    }

    public Klass getKlass() {
        return klass;
    }
}
