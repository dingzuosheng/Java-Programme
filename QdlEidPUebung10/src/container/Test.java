package container;

public class Test {

	public static void main(String[] args) {
		Container cwg=new ContainerWithGaps();
	//	for(int i=1;i<=15;i++) {
	//		cwg.add(i);
	//	}
		for(int i=0;i<=16;i++) {
			cwg.add(i);
		}
		cwg.remove(4);
		cwg.remove(2);
		cwg.printAll();
		System.out.println(cwg.count());
		System.out.println();
		Container cwog=new ContainerWithoutGaps();

		for(int i=1;i<=7;i++) {
	//	cwog.add(i);
			cwog.remove(i);
		}
		cwog.printAll();
		System.out.println(cwog.count());
		
	}

}
