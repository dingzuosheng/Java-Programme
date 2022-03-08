
public class MinusOp extends BinaryOp{

	public MinusOp(int n1, int n2) {
		super(n1, n2);
	}

	@Override
	public double calculate() {
		return n1-n2;
	}

	@Override
	public String toString() {
		return "("+n1+"-"+n2+")";
	}

}
