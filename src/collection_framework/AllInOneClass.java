package collection_framework;

public class AllInOneClass {

    Object ob;

    public AllInOneClass(Object ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return ob.toString();
    }

}
