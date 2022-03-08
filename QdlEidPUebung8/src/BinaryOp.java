
public abstract class BinaryOp implements Operator {
       int n1;
       int n2;
       public BinaryOp(int n1,int n2) {
    	   this.n1=n1;
    	   this.n2=n2;
       }
       public BinaryOp(int n1) {
    	   this.n1=n1;
       }
       public abstract double calculate();
       public abstract String toString();
}
