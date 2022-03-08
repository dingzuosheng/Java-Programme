
public class Vorlesung {
    private Student[] einStudent=new Student[100];
    int anzdieStudenten=0;
    private Dozent einDozent;
    
    
    private String titel;
    
    public Vorlesung(String titel,Dozent dozent) {
    	this.titel=titel;
    	this.einDozent =dozent;
    }
    public String getTitel() {
    	return this.titel;
    }
    public void removeTitel() {
    	this.titel=null;
    }
    public boolean addStudent(Student student) {
    	if(anzdieStudenten<einStudent.length) {
    		this.einStudent[anzdieStudenten]=student;
    		anzdieStudenten++;
    		return true;
    	}
    	return false;
    }
    public String toString() {
    	String b=titel+"\n"+"dozent:"+einDozent+"\n"+"Studenten:"+"\n";
    	for(int i=0;i<anzdieStudenten;i++) {    		
    		if(this.einStudent!=null) {		
    		b+=this.einStudent[i].getName();
    		}
    	}
    	return b;
    }

}
