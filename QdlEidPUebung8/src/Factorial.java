
public class Factorial implements Operator{
     int n1;
     public Factorial(int n1) {
    	 this.n1=n1;
     }
	@Override
	public double calculate() {
		double erg=1;
		double temp =n1;
		while(temp>0) {
			erg*=temp;
			temp--;
		}
		return erg;
	}
	public String toString() {
		return "("+n1+"!"+")";
	}

}
