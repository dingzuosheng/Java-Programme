
public class teilfeldfinden {

	public static void main(String[] args) {
		int[] feld = {1,3,5,1,3,5,1,8,5,3};
		int[] teilfeld= {1,8,5};
		int position=-1;
		int index=0;
		for(int i=0;i<feld.length;i++) {
			if(feld[i]==teilfeld[0]) {
				index=i;
				if(feld[index+1]==teilfeld[1]) {
					if(feld[index+2]==teilfeld[2]) {
						position=index;
					}
				}
			}
			
		}
		System.out.println(position);
		
	}

}
