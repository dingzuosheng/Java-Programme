package Praktikum10_A2;

public class Label {
	private String type;
	private int bestBefore;
	
	public Label(String type,int bestBefore) {
		this.type = type;
		this.bestBefore = bestBefore;
	}
	
	public String getType() {
		return this.type;
	}
	public int getBestBefore() {
		return this.bestBefore;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setBestBefore(int bestBefore) {
		this.bestBefore = bestBefore;
	}
}
