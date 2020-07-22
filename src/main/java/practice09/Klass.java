package practice09;


import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private String displayName;
    private Student leader;
    private List<Student> studentList=new ArrayList<Student>();

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

    }

    public void assignLeader(Student student){
        if (this.studentList.size()==0)
            System.out.print("It is not one of us.\n");
        else
            this.setLeader(student);
    }

}
