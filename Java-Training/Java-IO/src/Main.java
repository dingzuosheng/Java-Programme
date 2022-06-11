import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File f1 = new File("F:/FH Dortmund/4.semester/2020-Programmierkurs1");
        File f2 = new File("./..");

        System.out.println(f1.getName());
        System.out.println(f1.getPath());

        System.out.println(f2.getName());
        System.out.println(f2.getAbsolutePath());

        try{
            System.out.println(f2.getCanonicalPath());
        }catch(IOException e){
            e.printStackTrace();
        }

        String message = "Hallo Java IO!";
        String filepath = f2.getPath();
        System.out.println(filepath);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        osw.write(message.toCharArray());
        osw.flush();
    }
}
