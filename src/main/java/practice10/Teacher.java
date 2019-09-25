package practice10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Teacher extends Person{

    public Klass klass;
    LinkedList<practice10.Klass> classes = new LinkedList<Klass>();

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
    public Teacher(int id ,
                   String name ,
                   int age ,
                   LinkedList classes
    ) {
        super(id , name, age);
        this.classes = classes;
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

        LinkedList<String> strList = new LinkedList<String>();
        ListIterator<Klass> iterator = classes.listIterator();
        while( iterator.hasNext()){
            strList.add(String.valueOf(iterator.next().getKlass().getNumber()));
        }
        String joinedString = String.join(", ", strList);

        if(classes.toArray().length != 0 && klass==null ){
            return super.introduce() + String.format(" I am a %s. I teach Class %s." , className , joinedString);
        }
        if(klass==null){
            return super.introduce() + String.format(" I am a %s. I teach No Class." , className);
        } else
            return super.introduce() + String.format(" I am a %s. I teach Class %d." , className, klass.getNumber());
    }

    public String introduceWith(Student stud){
        String className = this.getClass().getSimpleName();
        if(this.getKlass().equals(stud.getKlass())){
            return super.introduce() + String.format(" I am a %s. I teach %s." , className, stud.getName());
        }else
            return super.introduce() + String.format(" I am a %s. I don't teach %s." , className, stud.getName());
    }

    public LinkedList getClasses () {
       return classes;
    }


    public boolean isTeaching (Student student) {
      if(classes.contains(student.klass)){
          return true;
      }else return false;
    }

}
