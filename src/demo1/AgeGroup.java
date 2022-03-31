package demo1;

public class AgeGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		

		int age=18;

		if(age<=2) {

			System.out.println("infants");
		}

		else if(age>2 && age<=12) {


			System.out.println("child");

		}
		else if(age>12 && age<=18) {


			System.out.println("youth");
		}
	
	else if(age>18) {


		System.out.println("Adult");
	}

}


}
