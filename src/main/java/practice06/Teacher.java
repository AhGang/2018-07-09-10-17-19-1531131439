package practice06;

public class Teacher {
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Teacher(String name, int age,int klass) {
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
        if(this.klass != 0){
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + this.getKlass() + ".";
        }else{
            return "My name is "+ this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }


    }


}
