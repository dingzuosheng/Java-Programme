package p10_Aufgabe2;

public class Lable {
	private String type;
	private int bestBefore;
	public Lable(String type,int bestBefore) {
		this.type = type;
		this.bestBefore = bestBefore;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	public void setBestBefore(int bestBefore) {
		this.bestBefore = bestBefore;
	}
	public int getBestBefore() {
		return this.bestBefore;
	}
}
