import java.io.File;

public class FileTree {
    private DirVisitor visitor;

    public FileTree(DirVisitor visitor){
        this.visitor = visitor;
    }

    public void traverse(File dir){
        if(dir.isDirectory()){
            visitor.enter(dir);
            File[] files = dir.listFiles();
            for(File f : files){
                if(f.isDirectory()){
                    traverse(f);
                }else{
                    visitor.visitFile(f);
                }
            }
            visitor.exit(dir);
        }
    }
}
