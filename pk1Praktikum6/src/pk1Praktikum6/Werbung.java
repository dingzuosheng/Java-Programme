package pk1Praktikum6;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class Werbung implements PropertyChangeListener{
   public static void drucken(double neu) {
	   System.out.println("Neuer Preis: "+ neu);
   }
   public static void drucken(Artikel a) {
	   drucken(a.getPreis());
	   
   }
@Override
public void propertyChange(PropertyChangeEvent arg0) {
	drucken((double)arg0.getNewValue());
}

   
}
