package practice08;



public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
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
        if (this.klass==null){
            result+="I teach No Class.";
        }
        else {
            result+="I teach "+this.klass.getDisplayName()+".";
        }

        return result;
    }

    public String introduceWith(Student student){
        int studentClass=student.getKlass().getNumber();
        int teacherClass=this.klass.getNumber();
        String result=this.headIntroduce();
        if (studentClass==teacherClass){
            result+="I teach "+student.getName()+".";
        }
        else {
            result+="I don't teach "+student.getName()+".";
        }
        return result;
    }
}
