package Aufgabe5;

public class Person {
	private String name;
	private int alter;
	public Person(String name, int alter){
	this.name = name;
	this.alter = alter;
	}
	public String getName(){
	return name;
	}
	public int getAlter(){
	return alter;
	}
	public static void main(String[] args) {
		Person p = new Person("Bill Gates",70);
		System.out.println(p.getName() + " ist "
				+ p.getAlter());
	}

}
