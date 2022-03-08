import java.io.File;

public class DirPrinter implements DirVisitor {
	private String indent;
	
	public DirPrinter() {
		indent = "";
	}
	@Override
	public void enter(File f) {
		System.out.printf("%s[%s]%n",indent,f.getName());
		indent+=" ";
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
