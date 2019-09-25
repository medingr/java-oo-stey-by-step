package practice07;

public class Klass {
    private int klass ;

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

    public String getDisplayName() {
        return "Class 2";
    }

}
