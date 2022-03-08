package vl_aufgabe28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Test {

	public static void sayHello(OutputStream stream) throws IOException {
		String ausgabe = "Hello World";
		PrintWriter pw = new PrintWriter(stream);
		pw.printf("%s%n", ausgabe);
		pw.flush();
	
	}
	public static void sayHello(File to) throws FileNotFoundException, IOException {
		String sAusgabe = "Hello World"; 
		int ausgabe = Integer.parseInt(sAusgabe);
		try(FileOutputStream fos = new FileOutputStream(to)){
			fos.write(ausgabe);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		sayHello(System.out);
		sayHello(new File("to.txt"));

	}

}
