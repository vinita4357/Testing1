package interview;

import java.util.Arrays;

public class secondlargestinarray {
	
	public static void main(String[] args) {
		int[] a= {3,5,2,6};
		System.out.println(Arrays.toString(a));
		System.out.print(a.length);
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-1]);
	}

}


