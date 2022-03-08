
public class Test {

	public static void main(String[] args) {
		Dozent stark = new Dozent( "Stark" );
		Dozent rettinger = new Dozent( "Rettinger" );
		
		Vorlesung eip = new Vorlesung( "EiP", stark );
		Vorlesung aud = new Vorlesung( "AuD", rettinger );
		
		Student s1 = new Student( "S1" );
		Student s2 = new Student( "S2" );
		Student s3 = new Student( "S3" );
		
		s1.addVorlesung( eip );
		s2.addVorlesung( aud );
		s3.addVorlesung( eip );
		s3.addVorlesung( aud );
		
		System.out.println( stark );
		System.out.println( rettinger );
		System.out.println( eip );
		System.out.println( aud );
		System.out.println( s1 );
		System.out.println( s2 );
		System.out.println( s3 );
		

	}

}
