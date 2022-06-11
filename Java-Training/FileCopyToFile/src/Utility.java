import java.io.*;

public class Utility {
    public static void copy(File from, File to){
        try(InputStream in = new FileInputStream(from);
            OutputStream out = new FileOutputStream(to)){
            int c;
            while((c = in.read())!= -1){
                out.write(c);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
