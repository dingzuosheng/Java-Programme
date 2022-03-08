package praktikum4;
import java.util.*;

public class ListInterfaceAufgabe
{
	// Elemente in Liste einf�gen
	static void fillList(List<String> list)
	{
		// Zahlen von 0 bis 20 als Zeichenketten (Strings) einf�gen
		for (int a = 0; a <= 20; a++)
			list.add("" + a);

		// Element an der Position 3 entfernen
		list.remove(3);

		// Erstes Element in der Liste entfernen, das gleich "6" ist
		list.remove("6");
	}

	// Liste vom Anfang bis zum Ende mit einer
	// foreach-Schleife iterieren und Elemente ausgeben
	static void printList(List<String> list)
	{
		for(Object o : list) {
			System.out.print(o+" ");
		}
		
	}

	// Alle Elemente aus der Liste entfernen, die durch 5 teilbar sind
	static void remove5List(List<String> list)
	{
		ListIterator<String> it=list.listIterator();
		while(it.hasNext()) {
			String e=it.next();
			if((e.endsWith("0")|e.endsWith("5"))) {
				it.remove();	
			}
			/*
			 int a =Integer.parseInt(e);
			 if(a%5==0){
			     it.remove();
			 }
			 */
		}
	}

	public static void main(String[] args)
	{
		// Erzeugen der LinkedList
		LinkedList<String> list1 = new LinkedList<String>();
		fillList(list1);
		System.out.println("\nAusgabe der ersten Liste(list1)");
		printList(list1);

		remove5List(list1);
		System.out.println("\nlist1 nach dem Entfernen der durch 5 teilbaren Zahlen");
		printList(list1);

		// Erzeugen der ArrayList
		ArrayList<String> list2 = new ArrayList<String>();
		fillList(list2);
		List<String> Teillist = list2.subList(list2.indexOf("7"),list2.indexOf("13")+1);
		

		System.out.println("\nAusgabe der zweiten Liste(Teillist)");
		printList(Teillist);
		
		ListIterator<String> it=Teillist.listIterator();
	/*	while(it.hasNext()) {
			String s=it.next();
			int a =Integer.parseInt(s);
			if(a==11) {
				it.remove();
			}
		} */
		
		 Teillist.remove("11");
		
		System.out.println("\nAusgabe der erneute Teillist");
		printList(Teillist);
		System.out.println(" ");
		printList(list2);

		// TODO
	}
}