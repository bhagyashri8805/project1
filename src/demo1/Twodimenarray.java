package demo1;

public class Twodimenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][]= {{10,56,53},{89,12,10},{12,5,63}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
			System.out.print("  "+a[i][j]);
		}
System.out.println();
	}

}
}