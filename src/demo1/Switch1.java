package demo1;

public class Switch1 {
	public static void main(String[] args)
	{
	int a = 10, b = 20, c;

	String key= "Sub";

	switch (key){
	case "Add": {

		c = a + b;
		System.out.println("Add = " +c);

		break;
		}
	
	case "Sub": {

		c = a - b;
		System.out.println("Sub = " +c);

		break;
	}

	default:
		
		System.out.println("Enter valid input");
		
		
	}
}

}