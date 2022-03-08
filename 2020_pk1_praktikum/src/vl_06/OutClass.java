package vl_06;

public class OutClass {
	private int i = 0;

	public void printIt() {
		InnerClass ic = new InnerClass();
		ic.doIt();
		System.out.println(i);
	}

	private class InnerClass {
		void doIt() {
			i = 22;
		}
	}

	public static void main(String[] args) {
		new OutClass().printIt();
	}
}
