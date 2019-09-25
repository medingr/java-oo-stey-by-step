package practice03;

public class Worker extends Person {
    public int klass=2;

    public Worker(String name ,
                   int age ) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce(){
        String className = this.getClass().getSimpleName();
        return String.format("I am a %s. I have a job." , className);
    }
}
