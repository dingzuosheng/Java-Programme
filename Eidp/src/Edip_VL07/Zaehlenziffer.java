package Edip_VL07;
import java.util.Scanner;
public class Zaehlenziffer {
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		int x = scn.nextInt();
		int [] nums = new int[x];
		int value=0;
		 count(nums,value);
		 scn.close();
	}

	
	public static void count(int[] nums,int value) {
		int zaehler=0;
		for(int i=0;i<nums.length;i++) {
			if(i==value) {
				zaehler++;
			}
		}	
	}
	
}

