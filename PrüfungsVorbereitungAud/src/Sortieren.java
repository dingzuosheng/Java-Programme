
public class Sortieren {
       	int links;
       	int rechts;
       	int[] array;
       	
       	public void insertionsort(int[] array,final int links,final int rechts) {
       		if(links<rechts) {
       			for(int i=links+1;i<rechts;i++) {
       				int x=array[i];
       				int j=i-1;
       				while(j>=links&&array[j]>x) {
       					array[j+1]=array[j];
       					j--;              //  Zeitkomplexitaet : Betsfall O(n),Mittlerfall O(n*n),Schlechtestfall O(n*n) 
       				}
       				array[j+1]=x;
       			}
       		}
       	}
       	public void selectionsort(int[] array,final int links,final int rechts) {
       		for(int i=links;i<rechts;i++) {
       			int min=i;
       			for(int j=links+1;j<rechts;j++) {
       				if(array[min]>array[j]) {
       					min=j;
       				}
       				int temp=array[min];
       				array[min]=array[i];
       				array[i]=temp;            //Zeitkoplexitaet :Bestfall O(n*n),Mittlerfall O(n*n), Schlechtestenfall O(n*n)
       			}
       		}
       	}
       
}
