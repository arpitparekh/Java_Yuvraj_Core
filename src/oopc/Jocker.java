package oopc;

class MyEncapsulation {

    public static void main(String[] args) {
        // encapsulation
        // data access hiding
        
        Jocker j = new Jocker();
        j.joke();
    }
    
}

public class Jocker {

    // we can access class in another package but that class have to be public

    public int a;             // default access
    private String name;
    float f;

    public void joke() {
        int k = 23;                    // inside a function you can not privode any access modifer
        System.out.println("hahaha");
    }
    
}
