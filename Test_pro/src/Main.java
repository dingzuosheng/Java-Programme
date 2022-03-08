
public class Main {

	public static void main(String[] args) {
		String str = new String("{"+"sensorId"+":"+"d9b9625a-d8f2-4b1e-a346-3285f56fbcbd"+","+"timestamp"+
			    ":"+"1622996778579"+","+"value"+":"+"58.429115"+"}");
    	for(String s: str.split(",")) {
    		System.out.println(s);
    	}

	}

}
