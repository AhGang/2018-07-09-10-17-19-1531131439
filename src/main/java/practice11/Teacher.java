package practice11;

import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        if(classes==null){
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }else{
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + classes.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")) + ".";
        }
    }


    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return "My name is " + super.getName() + ". I am 21 years old. I am a Teacher. I teach "+student.getName()+".";
        }else{
            return "My name is " + super.getName() + ". I am 21 years old. I am a Teacher. I don't teach "+student.getName()+".";
        }



    }

    public List<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        return classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber());
    }
}
