
public class Publication {
	private String id;
	private String payload;
	
	public Publication(String id,String payload) {
		this.id = id;
		this.payload = payload;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPayload() {
		return this.payload;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPayload(String payload) {
		this.payload = payload;
	}
}
