package repeat;

public class Statistik {
	public static double mean(int[] zahlen) {
		int i;
		double summe = 0.0;
		if(zahlen.length==0) {
			return 0.0;
		}
		for (i = 0; i < zahlen.length; i++) {
			summe += zahlen[i];
		}
		return summe / zahlen.length;
	}
}
