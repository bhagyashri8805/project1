package demo1;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Hello java Welcome to java";
        String output="";
		for(int i=s.length()-1;i>=0;i--)
		
			output=output + s.charAt(i);
			System.out.println(output);
		
		}

	}


