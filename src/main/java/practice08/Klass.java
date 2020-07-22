package practice08;

public class Klass {

    private int number;
    private String displayName;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        this.displayName="Class "+number;
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

    public void assignLeader(Student student){
        this.setLeader(student);
    }

}
