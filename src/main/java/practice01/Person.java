package practice01;

import java.util.Objects;

public class Person {
    //encapsulation
    private String name;
    private int age;

    Person(){
    };

    Person(String name , int age){
        this.name = name;
        this.age =  age;
    };

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int newAge) {
        this.age = age;
    }

    public String introduce(){
     return String.format("My name is %s. I am %d years old." , name, age);
    }

}
