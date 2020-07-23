package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    private List<Student> studentList=new ArrayList<Student>();
    private List<Observer> observers=new ArrayList<>();

    public Klass(int number) {
        this.number = number;
        this.displayName="Class "+number;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void appendMember(Student student){
        this.studentList.add(student);
        student.setKlass(this);
        notifyObserver("joined",student);
    }

    public void assignLeader(Student student){
        if (!this.studentList.contains(student))
            System.out.print("It is not one of us.\n");
        else{
            this.setLeader(student);
            notifyObserver("addLeader",student);
        }

    }

    public boolean isIn(Student student){
        for (Student student1 : this.studentList) {
            if (student1.id==student.id)
                return true;
        }
        return false;
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void notifyObserver(String status,Student student){
        for (Observer observer : observers) {
            observer.update(status,student);
        }
    }

}
