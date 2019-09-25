package practice06;

public class Student extends Person{
    public int klass=2;

    public Student(String name ,
                   int age ,
                   int klass) {
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
        return super.introduce() + String.format(" I am a %s. I am at Class %d." , className, klass);
    }

}
