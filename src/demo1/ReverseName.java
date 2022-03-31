package demo1;

public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Bhagyashri Subhash Shinde";
		String output="";
		String a[]=s.split(" ");

		for(int i=a.length-1;i>=0;i--)
		{
			output=output+a[i] + " ";

		}
		System.out.println(output);
	}

}


