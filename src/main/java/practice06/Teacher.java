package practice06;

public class Teacher extends Person{

    private int klass;

    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass=klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce(){
        String result=super.introduce()+" I am a Teacher. ";
        if (this.klass==0){
            result+="I teach No Class.";
        }
        else {
            result+="I teach Class "+this.klass+".";
        }

        return result;
    }

}
