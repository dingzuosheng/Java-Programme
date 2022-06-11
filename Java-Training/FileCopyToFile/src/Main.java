import java.io.File;

public class Main {
    public static void main(String[] args){
        File from = new File("E:\\Java-Training\\hello.txt");
        File to = new File("E:\\Java-Training\\hallo.txt");
        Utility.copy(from,to);
    }
}
