package practice10;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int id;

    Person(){
    };

    Person(int id , String name , int age ){
        this.name = name;
        this.age =  age;
        this.id = id;
    };

    Person(int id , String name  ){
        this.id = id;
        this.name = name;
    };

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAge(int newAge) {
        this.age = age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old." , name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                id == person.id &&
                Objects.equals(name, person.name);
    }
}
