package practice07;

public class Student extends Person{
    public Klass klass;

    public Student(String name ,
                   int age ,
                   Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
       return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce(){
        String className = this.getClass().getSimpleName();
        return super.introduce() + String.format(" I am a %s. I am at Class %d." , className, klass.getNumber());
    }

}
