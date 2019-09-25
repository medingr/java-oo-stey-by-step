package practice08;

public class Teacher extends Person{

    public Klass klass;

    public Teacher(int id ,
                   String name ,
                   int age ,
                   Klass klass) {
        super (id , name, age);
        this.klass = klass;
    }

    public Teacher(int id ,
                   String name ,
                   int age
    ) {
        super(id , name, age);
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
        if(klass==null){
            return super.introduce() + String.format(" I am a %s. I teach No Class." , className);
        } else
            return super.introduce() + String.format(" I am a %s. I teach Class %d." , className, klass.getNumber());
    }

    public String introduceWith(Student stud){
        String className = this.getClass().getSimpleName();
        if(this.getKlass() == stud.getKlass()){
            return super.introduce() + String.format(" I am a %s. I teach %s." , className, stud.getName());
        }else
        return super.introduce() + String.format(" I am a %s. I don't teach %s." , className, stud.getName());
    }

}
