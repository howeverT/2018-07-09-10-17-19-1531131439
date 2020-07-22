package practice10;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{

    private Klass klass;
    private List<Klass> classes=new LinkedList<Klass>();

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String headIntroduce(){
        return super.introduce()+" I am a Teacher. ";
    }

    public String introduce(){
        String result=this.headIntroduce();
        if (this.classes.size()==0){
            result+="I teach No Class.";
            return result;
        }
        else {
            result+="I teach Class ";
            for (Klass aClass : this.classes) {
                result+=aClass.getNumber()+", ";
            }
        }

        return result.substring(0,result.length()-2)+".";
    }

    public String introduceWith(Student student){
        int studentClass=student.getKlass().getNumber();
        //int teacherClass=this.klass.getNumber();
        String result=this.headIntroduce();
        for (Klass aClass : this.classes) {
            if (studentClass==aClass.getNumber()){
                result+="I teach "+student.getName()+".";
                return result;
            }

        }
        result+="I don't teach "+student.getName()+".";
        /*if (studentClass==teacherClass){
            result+="I teach "+student.getName()+".";
        }
        else {
            result+="I don't teach "+student.getName()+".";
        }*/
        return result;
    }

    public boolean isTeaching(Student student){
        for (Klass aClass : this.classes) {
            if (aClass.equals(student.getKlass()))
                return true;
        }
        return false;
    }

}
