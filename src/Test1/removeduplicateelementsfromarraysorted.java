package Test1;

import java.util.Arrays;

public class removeduplicateelementsfromarraysorted {
public static void main(String[] args) {
	int[] a= {0,0,1,2,3,3,4,5,6,6,7,7};
	int[] b = new int[a.length];
	int k=0;
	for(int i=0;i<a.length-1;i++) {
	
			if(a[i]!=a[i+1]) {
				b[k++]=a[i];
				
			}
		
	}
	b[k++]=a[a.length-1];
	
	for(int i=0;i<k;i++) {
		a[i]=b[i];
	}
	for(int i=0;i<k;i++) {
		System.out.print(a[i]);
	}
}
}
