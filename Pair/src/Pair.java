
public class Pair {
     private String first,second;
     public Pair() {
    	 this.first="";
    	 this.second="";
     }
     public Pair(String first,String second) {
    	 this.first=first;
    	 this.second=second;
     }
     public Pair(String str) {
    	 this.first=this.second=str;
     }
     public String getFirst() {
         return this.first;
     }
     public String getSecond() {
    	 return this.second;
     }
     public void setFirst() {
    	 this.first=first;
     }
     public void setSecond() {
    	 this.second=second;
     }
     public void print() {
    	 System.out.println("["+this.first+","+this.second+"]");
     }
     
     
}
