package interview;

public class mrgn {
	public long sum() {
		long i=5;
		long j=9;
		long k=6;
		long sum=0;
		while(i<j) {
			sum=sum+i;
			i++;
		}
		while(j>=k) {
			sum=sum+j;
			j--;
		}
		
		System.out.print(sum);
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		mrgn m=new mrgn();
		m.sum();
	}

}
