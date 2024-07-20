public class MyString {

    public static void main(String[] args) {
        
        // string
        // string immuable
        // gropu of character

        String name = "Arpit";
        String name2 = "Arpit";

        String name3 = new String("Arpit");
        String name4 = new String("Arpit");

        System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name == name3);
        System.out.println(name2 == name4);


        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name));

    }
        
}
