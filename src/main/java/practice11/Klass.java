package practice11;

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

    public void assignLeader(Student student){

        if (appendMember(student)) {
            leader = student;
        }else
            System.out.print("It is not one of us.\n");

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

    public boolean appendMember(Student student){
       return this.getKlass().equals(student.getKlass());
    }

}
