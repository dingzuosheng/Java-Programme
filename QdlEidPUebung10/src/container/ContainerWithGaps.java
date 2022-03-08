package container;

public class ContainerWithGaps extends Container{
	
	@Override
	public void add(Object object) {
		if ( count() >= objects.length )
			grow();
		
		for(int i=0;i<objects.length;i++) {
			if(objects[i]==null) {
				objects[i]=object;
				break;       //jedes mal nur ein Object eingefuegt wird;
			}
		}
	}

	@Override
	public void remove(Object object) {
		if(count()<=objects.length && count() > 0) 
			schrumpfen();
		
		for(int i=0;i<objects.length;i++) {
			if(objects[i].equals(object)) {
				objects[i]=null;
				break;
			}
		}
	}

	@Override
	public int count() {
		int anzahl=0;
		for(int i=0;i<objects.length;i++) {
			if(objects[i]!=null) {
				anzahl++;
			}
		}
		return anzahl;
	}

	@Override
	public Object get(int objectNumber) {
		if(objectNumber<objects.length) {
			return objects[objectNumber];
		}
		return null;
	}

}
