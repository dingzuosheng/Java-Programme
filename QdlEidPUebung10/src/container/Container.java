package container;

public abstract class Container {
	protected Object[] objects = new Object[10];

	// in Aufgabestellung gibt es keine Atrribute dann braucht keine zu
	// ergaenzen;und Konstruktor auch nicht
	public abstract void add(Object object);

	public void add(Object[] object) {
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == null) {
				objects[i] = object;
			}
		}
	}

	public abstract void remove(Object object);

	public abstract int count();

	public abstract Object get(int objectNumber);

	public boolean contains(Object object) {
		for (int i = 0; i < objects.length; i++) {
			if (objects[i].equals(object)) { // Vergleich von String und Object sollte man x.equals()benutzen,
												// sonst andere benutzt man ==;
				return true;
			}
		}
		return false;
	}

	public void printAll() {
		String str = "";
		for (int i = 0; i < objects.length; i++) {
			if (i < objects.length - 1 && objects[i] != null) {
				str = str + objects[i] + ",";
			} else {
				str += objects[i];
			}
		}
		System.out.println(str);
	}

	protected void grow() {
		Object[] newObjects = new Object[(int) (objects.length * 1.5)];
		for (int i = 0; i < objects.length; i++) {
			newObjects[i] = objects[i];
		}
		this.objects = newObjects;
	}

	protected void schrumpfen() {
		if ( objects.length > 10 && count()/objects.length < 0.8) {
			int temp=(int) (objects.length * 0.8);
			if(temp < 10)
				temp = 10;
			Object[] newObjects = new Object[temp];
			int a = 0;
			for (int i = 0; i < objects.length; i++) {
				if( objects[i]!=null)
					newObjects[a++] = objects[i];
			}
			this.objects = newObjects;
		}
	}

}
