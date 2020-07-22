package practice05;

public class Worker extends Person{

    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        practice04.Person person=new practice04.Person(this.name,this.age);
        return super.introduce()+" I am a Worker. I have a job.";
    }

}
