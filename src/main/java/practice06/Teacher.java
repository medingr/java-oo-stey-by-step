package practice06;

public class Teacher extends Person{

    public int klass=2;

    public Teacher(String name ,
                   int age ,
                   int klass) {
        super(name, age);
    }

    public Teacher(String name ,
                   int age
                   ) {
        super(name, age);
        klass = 0;
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
        if(klass==0){
            return super.introduce() + String.format(" I am a %s. I teach No Class." , className);
        } else
        return super.introduce() + String.format(" I am a %s. I teach Class %d." , className, klass);
    }

}
