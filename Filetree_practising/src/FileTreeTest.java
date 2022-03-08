import java.io.File;

public class FileTreeTest {

	public static void main(String[] args) {
		FileTree tree = new FileTree(new DirPrinter());
		File f = new File("F:\\FH Dortmund\\第四学期\\2020-Programmierkurs1");
		tree.traverse(f);
	}

}
