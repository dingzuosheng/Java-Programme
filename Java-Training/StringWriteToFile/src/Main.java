import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Utility.sayHello(System.out);

        FileOutputStream fos = new FileOutputStream(new File("E:\\Java-Training\\hello.txt"));
        Utility.sayHello(fos);
    }
}
