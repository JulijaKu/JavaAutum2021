package sef.FinialActivity;

public class Student extends Person{

    private String schoolName;
    private String name;
    private int age;


    public Student() {
        System.out.println("My name is <name> + and I am <age> years old + I am study in university <schoolName>");
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void introduce() {
        System.out.println("Inside Person Class");
    }



    }
