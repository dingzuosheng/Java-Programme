
public class Position {
    private double x,y,z;
    public Position(double x,double y,double z) {
    	this.x=x;
    	this.y=y;
    	this.z=z;
    }
    public Position() {
 
    }
    public double getX() {
    	return this.x=x;
    }
    public double getY() {
    	return this.y=y;
    }
    public double getZ() {
    	return this.z=z;
    }
    public void setX(double a) {
    	this.x=a;
    }
    public void setY(double d) {
    	this.y=d;
    }
    public void setZ(double b){
    	this.z=b;
    }
    public void print() {
    	System.out.println("["+this.x+","+this.y+","+this.z+"]");
    }
    public double distanceToOrigin() {
        return Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
        
    }
    public void add(Position p) {
    	this.x+=p.x;
    	this.y+=p.y;
    	this.z+=p.z;
    	
    }
    public void div(double m) {
    	if(m!=0)
    	this.x*=1/m;
    	this.y*=1/m;
    	this.z*=1/m;
    }
    public String toString() {
    	return this.x+","+this.y+","+this.z;
    }
}
