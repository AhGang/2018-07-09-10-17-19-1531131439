package practice07;

public class Teacher {
    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Teacher(String name, int age,Klass klass) {
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

    public Klass getKlass() {
        return this.klass;
    }
    public String introduce() {
        if(klass==null){
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }else{
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }
    }


    public String introduceWith(Student jerry) {
        if(this.klass.getNumber() == jerry.getKlass().getNumber()){
            return "My name is " + this.name + ". I am 21 years old. I am a Teacher. I teach "+jerry.getName()+".";
        }else{
            return "My name is " + this.name + ". I am 21 years old. I am a Teacher. I don't teach "+jerry.getName()+".";
        }

    }
}

