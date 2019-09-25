package practice09;

public class Student extends Person{
    public Klass klass;

    public Student( int id ,
                    String name ,
                    int age ,
                    Klass klass) {
        super( id , name , age );
        this.klass = klass;
    }

    public Student( int id ,
                    String name
    ) {
        super( id , name );
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

        if(this.equals(klass.getLeader())){
            return super.introduce() + String.format(" I am a %s. I am Leader of Class %d." , className, klass.getNumber());
        }else
            return super.introduce() + String.format(" I am a %s. I am at Class %d." , className, klass.getNumber());

    }

}
