public class HeapSort
{
	// Versickere das Element mit Index zuversickern in dem Teilfeld von Index links bis einschließlich Index rechts
	public static void versickere(int[] array, int zuversickern, final int links, final int rechts)
	{
		// Im Gegensatz zur Vorlesung benoetigt diese Methode drei Parameter, da der zu sortierende Bereich
		// nicht bei 0, sondern bei links anfuegt. Linkes Kind von Knoten x: (x-links)*2+links+1
		int i=zuversickern;
		int x=array[i];
		boolean versinkenErforderlich=true;
		while(links+2*(i-links)+1<=rechts) {
			int j=links+2*(i-links)+1;
			if(j+1<=rechts&&array[j]<array[j+1]) {
				j++;
			}
			if(x<array[j]) {
				array[i]=array[j];
				i=j;
			} else {
				array[i]=x;
				i=rechts;
				versinkenErforderlich=false;
			}
		}
		if(versinkenErforderlich) {
			array[i]=x;
		}
	}

	public static void heapsort(int[] array, final int links, final int rechts)
	{
		for(int i=(rechts+links)/2;i>=links;i--) {
			versickere(array,i,links,rechts);
		}
		for(int j=rechts;j>links;j--) {
			int temp=array[links];
			array[links]=array[j];
			array[j]=temp;
			versickere(array,links,links,j-1);
		}
	}
}