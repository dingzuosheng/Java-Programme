package pk1Praktikum6;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Observable;

public class Artikel  implements Serializable {
   private String id;
   private double preis;
   PropertyChangeSupport pcs;
   
   public Artikel(String id,double preis) {
	   pcs=new PropertyChangeSupport(this);
	   this.id=id;
	   this.preis=preis;
   }
   
   public String gertId() {
	   return id;
   }
   public void setId(String id) {
	   this.id=id;
   }
   public double getPreis() {
	   return preis;
   }
   public void setPreis(double preis) {
	   double alt=this.preis;
	   this.preis=preis;
	   pcs.firePropertyChange("preis",alt , preis);
   }
   public void addlistener(PropertyChangeListener pcl) {
	  pcs.addPropertyChangeListener(pcl); 
   }
   public void removeListener(PropertyChangeListener pcl) {
	   pcs.removePropertyChangeListener(pcl);
   }
   
  
}
