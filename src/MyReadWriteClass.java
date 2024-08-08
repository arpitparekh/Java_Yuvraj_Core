
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyReadWriteClass {

    public static void main(String[] args) {

        File file = new File("/home/arpit-parekh/files/one.txt");

        // for crating a folder
        // File file2 = new File("/home/arpit-parekh/yuvraj");
        // file2.mkdir();
        // file.createNewFile()
        // "Hello World"
        // Stream  // squence of data
        // ByteStream
        // CharacterStream
        // ByteStream
        try {

            // FileOutputStream fos = new FileOutputStream(file);
            // String data = "Hello Yash and Yuvraj";
            // fos.write(data.getBytes());
            // fos.close();
            // System.out.println("File Write Successfully");
            FileInputStream fis = new FileInputStream(file);
            // byte[] b = new byte[fis.available()];
            // fis.read(b);
            // String result = new String(b);
            // System.out.println("File Read Successfully\n" + result);

            // Buffer input and Buffer output stream
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;

            while ((i = bis.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
