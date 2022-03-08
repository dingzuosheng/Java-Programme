
public class PositonTest {

	public static void main(String[] args) {
		Position pos1 = new Position(1,2,3);
		Position pos2 = new Position();
		pos1.setY(5);
		System.out.println(pos2.getX());
		pos2.setX(25.5);
		
		
		pos1.print();
		System.out.println(pos2.distanceToOrigin());
		pos2.add(pos1);
		System.out.println(pos2);
		pos1.div(2.0);
		pos2.div(2.0);
		System.out.println(pos1);
		System.out.println(pos2);

	}

}
