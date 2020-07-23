package practice11;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person implements Observer{
    private Klass klass;
    private List<Klass> classes=new LinkedList<Klass>();

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass aClass : classes) {
            aClass.addObserver(this);
        }
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

    @Override
    public void update(String status, Student student) {
        if (status.equals("addLeader"))
            System.out.print("I am "+this.name+". I know "+student.getName()+" become Leader of Class "+student.getKlass().getNumber()+".\n");
        //    System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
        else if (status.equals("joined"))
            System.out.print("I am "+this.name+". I know "+student.getName()+" has joined Class "+student.getKlass().getNumber()+".\n");
    }
}
