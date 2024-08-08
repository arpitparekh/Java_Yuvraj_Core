import java.io.File;
import java.io.IOException;

public class MyFileHandlingClass {
    public static void main(String[] args) {
        
        File file = new File("/home/arpit-parekh/files/my_file.txt");
        
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());

        file.delete();

    }
}
