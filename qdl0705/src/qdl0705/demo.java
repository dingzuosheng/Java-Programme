package qdl0705;

public class demo {

	public static void main(String[] args) {
		

	}
	public static char[][] treppe(int n){
		char[][] a= new char[n][2*n-1];
		for(int i=0;i<n;i++) {
			for(int j=i;j<i+n;j++) {
				a[i][j]='*';
			}
		}
		return a;
	}

}
