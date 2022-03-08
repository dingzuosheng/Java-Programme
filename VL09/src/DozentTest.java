
public class DozentTest {

	public static void main(String[] args) {
		Dozent dieDozentin=new Dozent("Laura Hoffmann","Mathe",'w');
		Dozent derDekan=new Dozent("Karl Max","Englisch",'m');
		dieDozentin.setLehrgebiet("Biologie");
		dieDozentin.setDekan(false);
		derDekan.setDekan(true);
		
		System.out.println(derDekan.getName());
		System.out.println(derDekan.getLehrgebiet());
		System.out.println(derDekan.isDekan());
		System.out.println(derDekan.getGeschlecht());
		System.out.println(dieDozentin.getName());
		System.out.println(dieDozentin.getLehrgebiet());
		System.out.println(dieDozentin.isDekan());
		System.out.println(dieDozentin.getGeschlecht());

	}

}
