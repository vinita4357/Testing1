package Test1;

public class reversesentencewordbyword {
	public static void main (String[] args) {
		String str="Java concept of the day";
		/***
		String[] str1=str.split(" ");
		for(int k=str1.length-1;k>=0;k--) {
			System.out.print(str1[k]+" ");
		}
		***/
		String str1="";
		for(int k=str.length()-1;k>=0;k--) {
			str1=str1+str.charAt(k);
		}
		System.out.print(str1);
	}

}
