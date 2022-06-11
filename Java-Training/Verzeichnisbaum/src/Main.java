import java.io.File;

public class Main {
    public static void main(String[] args){
        FileTree ft = new FileTree(new DirPrint());
        ft.traverse(new File("F:\\FH Dortmund\\4.semester\\2020-Programmierkurs1"));
    }
}
