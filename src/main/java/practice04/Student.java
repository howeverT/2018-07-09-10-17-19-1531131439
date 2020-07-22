package practice04;

public class Student extends Person{
    private int klass;

    public Student(String name, int age,int klass) {
        super(name, age);
        this.klass=klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce(){
        Person person=new Person(this.name,this.age);
        return person.basicIntroduce()+" I am a Student. I am at Class "+this.klass+".";
    }
}
