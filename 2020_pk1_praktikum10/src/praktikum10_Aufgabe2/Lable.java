package praktikum10_Aufgabe2;

public class Lable {
	private String type;
	private int bestBefore;
	
	public Lable(String type,int bestBefore) {
		this.type=type;
		this.bestBefore=bestBefore;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getBestBefore() {
		return this.bestBefore;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public void setBestBefore(int bestBefore) {
		this.bestBefore=bestBefore+2020;
	}
}
