package practice08;

public class Klass {
    private int klass ;

    private Student leader;

    Klass () {
    }

    Klass( int klass){
        this.klass = klass;
    };

    public int getNumber() {
        return klass;
    }

    public void setNumber(int klass) {
        this.klass = klass;
    }

    public Student assignLeader(Student student){
        leader = student;
        return leader;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class 2";
    }

    public Klass getKlass() {
        return this;
    }

}
