package practice11;

public class Student {
    private String name;
    private int age;


    private Klass klass;
    private int id;
    public Student(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
