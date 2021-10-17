package sef.FinialActivity;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void introduce() {

        System.out.println("My name is" + this.name + "and I am" + this.age + "year old");
    }


}
