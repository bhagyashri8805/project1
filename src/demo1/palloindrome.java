package demo1;

public class palloindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="absdba";
		String s1="";

		palloindrome obj=new palloindrome();

		if(obj.isPallindrome(s)) {

			System.out.print("String is pallindrome");
		}
		else {

			System.out.print("String is not pallindrome");
		}
	}

	String reverse(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1 + s.charAt(i);



		}
		return s1;


	}

	boolean isPallindrome(String s2)
	{
		if(reverse(s2).equals(s2))	

		{
			return true;	

		}
		else
		{
			return false;	
		}
	}

}

