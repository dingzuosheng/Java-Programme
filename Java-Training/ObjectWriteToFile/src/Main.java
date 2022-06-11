import java.io.File;

public class Main {
    public static void main(String[] args){
        Angestellter a = new Angestellter("Ingo Oberhausen",2000.99);
        File file = new File("E:\\Java-Training\\Angestelleter.txt");
        Util.schreiben(a,file);

    }
}
