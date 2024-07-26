package oopc;

public class AnotherClass {
    public static void main(String[] args) {
        
        Institute i = new Institute();
        i.assignValues("Bascom", "Vastrapur", 30, 6);
        i.display();
    }
}

class Institute {

    String name;
    String address;
    int noOfStudent;
    int noOfTeacher;
    int a = 14;

    // to use class property inside a class we have to use this keyword

    void assignValues(String name, String address, int noOfStudent, int noOfTeacher) {
        this.name = name;
        this.address = address;
        this.noOfStudent = noOfStudent;
        this.noOfTeacher = noOfTeacher;
    }
    
    void display() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(noOfStudent);
        System.out.println(noOfTeacher);
    }

}