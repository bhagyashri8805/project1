package demo1;

public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Maxnumber=0;
		int a[]= {10,20,30,40,50};
		
			for(int i=0;i<a.length;i++) 
			{
		
			if(Maxnumber<a[i]) {
				Maxnumber=a[i];
	       }
		
			}
	
	
			System.out.println(Maxnumber);
	}
	
}
