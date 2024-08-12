package collection_framework;

public class Student {   // Object class

    private String name;
    private Integer age;
    private Float height;


    public Student(String name, Integer age, Float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", height=" + height + ", name=" + name + "]";
        
    }

}
