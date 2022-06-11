import java.io.File;

public class DirPrint implements DirVisitor{
    private String indent;

    public DirPrint(){
        indent = " ";
    }

    @Override
    public void enter(File f) {
        System.out.printf("%s[%s]%n",indent,f.getName());
        indent = indent + " ";
    }

    @Override
    public void visitFile(File f) {
        System.out.printf("%s%s%n",indent,f.getName());
    }

    @Override
    public void exit(File f) {
        indent = indent.substring(1);
    }
}
