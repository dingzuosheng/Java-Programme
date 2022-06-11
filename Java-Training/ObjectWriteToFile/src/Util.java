import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Util {
    public static void schreiben(Angestellter a, File f){
        try(FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw)){
            pw.printf("Name:%s%n",a.getName());
            pw.printf("Gehalt:%f.2%n",a.getGehalt());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
