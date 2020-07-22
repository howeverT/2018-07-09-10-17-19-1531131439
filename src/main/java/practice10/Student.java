package practice10;



public class Student extends Person{

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public boolean isLeader(){
        Student leadFlag=this.klass.getLeader();
        if (leadFlag!=null&&leadFlag.name.equals(this.name))
            return true;
        return false;

    }

    public String introduce(){
        if (!isLeader())
            return super.introduce()+" I am a Student. I am at "+this.klass.getDisplayName()+".";
        else
            return super.introduce()+" I am a Student. I am Leader of "+this.klass.getDisplayName()+".";
    }

}
