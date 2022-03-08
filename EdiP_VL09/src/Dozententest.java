import java.util.Scanner;
public class Dozententest {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String name1=scn.next();
		String name2=scn.next();
		String lehrgebiet1=scn.next();
		String lehrgebiet2=scn.next();
		char geschlecht1=scn.next().charAt(0);
		char geschlecht2=scn.next().charAt(0);
		
		Dozent dieDozentin = new Dozent(name1,lehrgebiet1,geschlecht1);
		dieDozentin.setDekan(false);
		dieDozentin.setLehrgebiet("Englisch");
		Dozent derDekan=new Dozent(name2,lehrgebiet2,geschlecht2);
		derDekan.setDekan(true);	
		System.out.println(dieDozentin.getName());
		System.out.println(dieDozentin.getLehrgebiet());
		System.out.println(dieDozentin.isDekan());
		System.out.println(dieDozentin.getGeschlecht());
		System.out.println(derDekan.getName());
		System.out.println(derDekan.getLehrgebiet());
		System.out.println(derDekan.isDekan());
		System.out.println(derDekan.getGeschlecht());
		
        

	}

}


	

