import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Utility {
    public static void sayHello(OutputStream s) throws IOException {
        String t = "Hello World";
        OutputStreamWriter osw = new OutputStreamWriter(s);

        osw.write(t.toCharArray());
        osw.flush();
    }
}
