package practice10;

import com.sun.deploy.util.StringUtils;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher {
    private String name;
    private int age;
    private Klass klass;
    private int id;
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }
    public Teacher(int id, String name, int age, List<Klass> linkedList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = linkedList;

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
        if(classes==null){
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }else{
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + classes.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")) + ".";
        }
    }


    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return "My name is " + this.name + ". I am 21 years old. I am a Teacher. I teach "+student.getName()+".";
        }else{
            return "My name is " + this.name + ". I am 21 years old. I am a Teacher. I don't teach "+student.getName()+".";
        }



    }

    public List<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        return classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber());
    }
}
