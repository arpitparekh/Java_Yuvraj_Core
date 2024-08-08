
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class DownloadFileAndWriteClass {

    public static void main(String[] args) {

        try {

            BufferedInputStream in = new BufferedInputStream(new URL("https://file-examples.com/storage/fe44eeb9cb66ab8ce934f14/2017/10/file_example_JPG_100kB.jpg").openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("/home/arpit-parekh/hello.jpg");

            byte dataBuffer[] = new byte[1024];

            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }

            in.close();
            fileOutputStream.close();

            System.out.println("File Downloaded Successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
