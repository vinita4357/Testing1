package testjava;

public class minmoccurancecharacterinstring {
	public static void main(String[] args) {
		String s="vanita";
		int k=s.length();
		int[] freq=new int[k];
		char[] chararray=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<s.length();j++) {	
				if(chararray[i]==chararray[j] &&(chararray[i]!='0') &&(chararray[i]!=' ') )
				{
					freq[i]++;
					chararray[j]=0;
				}
				
			}
		}
		System.out.print(freq.toString());
	int min;
	int max;
	char minchar;
		   min = max = freq[0];    
		      for(int i = 0; i <freq.length; i++) {    
		              
		          //If min is greater than frequency of a character     
		          //then, store frequency in min and corresponding character in minChar    
		          if(min > freq[i] && freq[i] != '0') {    
		              min = freq[i];    
		              min = chararray[i];    
		          }  
	
	}
}}
