package oopc;

// class is a blueprint
// class is collection of atributes and methods

class Student {

    // attributes

    String name="";
    int age = 0;
    int rollNumber;
    int phoneNumber;
    String email;
    String address;
    String gender;
    String course;
    String university;
    String department;

    // methods

    void display() {
        System.out.println("This is display function");
    }
    
}

public class MainClass {
    
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Rahul";
        s.age = 21;
        s.rollNumber = 123;
        s.phoneNumber = 123456789;
        s.email = "rahul@gmail.com";
        s.address = "Delhi";
        s.gender = "Male";
        s.course = "Btech";
        s.university = "IIT";
        s.department = "CSE";
        s.display();

        Student s1 = new Student();
        s1.display();

    }

}

