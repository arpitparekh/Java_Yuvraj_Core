package collection_framework;

import java.util.ArrayList;

public class MyCollection {

    public static void main(String[] args) {

        // primitive datatypes
        // byte
        // short
        // int
        // long
        // float
        // double
        // boolean
        // char

        // Wrapper class

        Integer i = 12;

        String str = i.toString();

        byte b = 12;
        Byte b2 = b;   // explicitly declaring a wrapper class  // boxing

        byte b3 = b2.byteValue();  // unboxing

        System.out.println(b3);

        Double d = 34.34;
        double d1 = d.doubleValue();

        System.out.println(d1);

        PleaseStudyOrIWIllCallMom psoiwcm = new PleaseStudyOrIWIllCallMom();
        System.out.println(psoiwcm.b);
        System.out.println(psoiwcm.b1);

        // The Collection in Java is a framework 
        // that provides an architecture to store and manipulate the group of objects.

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(12);
        list.add(15);
        list.add(13);
        list.add(16);
        list.add(17);

        System.out.println(list);

        list.add(18);
        System.out.println(list);

        list.add(2, 99);
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(101);
        newList.add(102);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.contains(102));

        System.out.println(list.get(2));

        System.out.println(list.indexOf(102));

        System.out.println(list.lastIndexOf(102));

        list.set(2, 102);

        System.out.println(list);

        System.out.println(list.lastIndexOf(102));
        System.out.println(list.indexOf(102));

        list.remove(2);
        System.out.println(list);

        list.clear();
        System.out.println(list);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rahul", 21, 5.6f));
        studentList.add(new Student("Raj", 21, 5.6f));

        System.out.println(studentList);  // wierd output

        for (Student s : studentList) {
            s.display();
        }

        ArrayList<AllInOneClass> myList = new ArrayList<>();
        myList.add(new AllInOneClass(12));
        myList.add(new AllInOneClass("Hello"));
        myList.add(new AllInOneClass(12.34f));
        myList.add(new AllInOneClass(newList));

        System.out.println(myList);

        // make object of interface

        MyInterface obj = new MyInterface() {

            @Override
            public int getSum(int a, int b) {
                return a + b;
            }

            @Override
            public String toString() {
                return "This is Interface";
            }
            
        };

        myList.add(new AllInOneClass(obj));

        System.out.println(myList);


    }


}

class PleaseStudyOrIWIllCallMom {
    byte b;
    Byte b1;
}
