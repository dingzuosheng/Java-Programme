
public abstract class DateiSystemEintraege implements Comparable<DateiSystemEintraege> {
      protected String name;
      public DateiSystemEintraege(String name) {
    	  this.name=name;
      }
      void setName(String name) {
    	  this.name=name;
      }
      String getName() {
    	  return this.name;
      }
      abstract void open();
	  abstract void print(int einrueckung);
	
}
