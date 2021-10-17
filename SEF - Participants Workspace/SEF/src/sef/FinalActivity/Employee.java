package sef.FinialActivity;

public class Employee extends Person {

    private String company;
    private String jobTitle;
    private String name;
    private int age;
    private double salary;


    public Employee(){
        System.out.println("I'm Employee constructor");
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;

    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
    public void setAge(int age){
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
        public void introduce() {
        System.out.println("Inside Person Class");
    }
}
