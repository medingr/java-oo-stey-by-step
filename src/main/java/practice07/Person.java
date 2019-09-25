package practice07;

public class Person {
    private String name;
    private int age;

    Person(){
    };

    Person(String name , int age){
        this.name = name;
        this.age =  age;
    };


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
