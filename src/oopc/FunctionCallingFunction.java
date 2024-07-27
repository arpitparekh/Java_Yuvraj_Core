package oopc;

public class FunctionCallingFunction {

    public static void main(String[] args) {

        ServiceClass service = new ServiceClass();
        service.repo.myFunction();

        // api => local database
    }
}

class ServiceClass {  // api call

    RepoClass repo;

    ServiceClass() {
        repo = new RepoClass();
    }

}

class RepoClass {  // local database  // crud 

    void myFunction() {
        System.out.println("Hello");
    }

}