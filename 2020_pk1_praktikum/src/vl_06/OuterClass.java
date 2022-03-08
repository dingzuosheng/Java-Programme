package vl_06;

public class OuterClass {

	private int i = 0;

	public void printIt() {
		InnerClass ic = new InnerClass();
		ic.doIt();
		System.out.println(i);
	}

	private class InnerClass {
		int i; //locale Variable ,wird nicht benutzt 

		void doIt() {
			OuterClass.this.i = 22;
		}
	}

	public static void main(String[] args) {
		new OuterClass().printIt();
	}

}
