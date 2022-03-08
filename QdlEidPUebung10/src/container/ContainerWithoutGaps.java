package container;

public class ContainerWithoutGaps extends Container{
	private int numObjects;
	@Override
	public void add(Object object) {
		if(numObjects>=objects.length) {
			grow();
		}	
		
		objects[numObjects++]=object;
	}

	@Override
	public void remove(Object object) {
		if(numObjects<=objects.length && count() > 0)
			schrumpfen();
		for(int i=0;i<numObjects;i++) {
			if(objects[i]!=null) {
				objects[i]=null;
			}
		}	
	}

	@Override
	public int count() {
		int anzahl=0;
		for(int i=0;i<numObjects;i++) {
			if(objects[i]!=null) {
				anzahl++;
			}
		}
		return anzahl;
	}

	@Override
	public Object get(int objectNumber) {
		if(objectNumber<numObjects)
			return objects[objectNumber];
		return null;
	}

}
